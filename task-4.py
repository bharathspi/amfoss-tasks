from os import urandom
from ctypes import CDLL
import string
import hashlib

def xor_encrypt(x,key):
    flag = ""
    hex_key = key.encode("hex")
    key_list = [hex_key[i]+hex_key[i+1] for i in range(0,len(hex_key),2)]
    for i in xrange(len(x)):
        flag += chr(ord(x[i]) ^ int(key_list[i%5], 16))
    return flag

def execute(x):
        k=0
	upper=string.ascii_uppercase
	lower=string.ascii_lowercase
	a=upper+lower
	key=""
	t=0
	for i in a:
		if(k==1):
             		break
		for j in a:
			for k in a: 
				for l in a:
					for m in a:
						t+=1
						key=(i+j+k+l+m)
                        			print "process", t,key
						flag=xor_encrypt(x,key)
						if(hash_check(flag)==1):
							print flag
		                                	k=1
                                                
def hash_check(flag):
	if hashlib.md5(flag).digest().encode("hex") == "d444d1ac3799a86d31f34b4a8a3243c6":
    		return 1
	else:
		return 0
	
if __name__ == "__main__":
	ciphertext="05181c2638270301601329023a203c2324072229230401273f2a1b0b02252b071e243e2313262923352411332336031b2f2d27191602383f07062e0827041725092e161e2d2f281017092f34123b321e2e12342d2b210c0b0e3f191f33370f1935000e2123392d132f163213152308302d0a0f3f282a0e183b".decode('hex')
	execute(ciphertext)   
