#include <iostream>
#include<conio.h>
using namespace std;
class diem
{
    private:
      float x,y;
    public:
      diem(float tx = 0, float ty = 0)  
      {
        x = tx; y = ty;
      }
      friend int trung(diem. diem);
};
int trung(diem p,  diem q)
{
    if(p.x == p.x && p.y == q.y)
      return 1;
    else return 0;  
}
//................................................................
