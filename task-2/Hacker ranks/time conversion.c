#include <stdio.h>
#include <stdlib.h>
int main() {
  char a, b;
  int h;
  int min;
  int sec;
  scanf("%d:%d:%d%c%c", &h, &min, &sec, &a, &b);
  if (a == 'A' && h == 12) {
    h = 0;
    printf("%02d:%02d:%02d", h, min, sec);
  } else if (a == 'A' && h != 12) {
    printf("%02d:%02d:%02d", h, min, sec);
  }
  if (a == 'P' && h != 12) {
    h = h + 12;
    printf("%02d:%02d:%02d", h, min, sec);
  }else if(a=='P'&&h==12){
    printf("%02d:%02d:%02d", h, min, sec);
  }

  return 0;
}
