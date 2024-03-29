
import pytesseract
import os
import argparse
try:
    import Image, ImageOps, ImageEnhance, imread
except ImportError:
    from PIL import Image, ImageOps, ImageEnhance

def solve_captcha(path):

    """
    Convert a captcha image into a text, 
    using PyTesseract Python-wrapper for Tesseract

    Arguments:
        path (str):
            path to the image to be processed
    Return:
        'textualized' image

    """
    image = Image.open(path).convert('RGB')
    image = ImageOps.autocontrast(image)

    filename = "coloured.png".format(os.getpid())
    image.save(filename)

    text = pytesseract.image_to_string(Image.open(filename))
    return text


if __name__ == '__main__':
    argparser = argparse.ArgumentParser()
    argparser.add_argument("-i", "--image", required=True, help="path to input image to be OCR'd")
    args = vars(argparser.parse_args())
    path = args["image"]
    print('Resolving....')
    captcha_text = solve_captcha(path)
    print("below expression is interpreted from image")
    print(format(captcha_text))
a=format(captcha_text)
print("result of expression")
print(eval(a))

