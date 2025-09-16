class Solution {
        public int add(int num)
        {
              int sum=0;
        
            while(num>0)
            {
                int digit=num%10;
                sum+=digit;
                num=num/10;
            }
           return sum;
        }
         public int addDigits(int num) {
           if(num<10)
           {
            return num;
           }
            return addDigits(add(num));
        }
       
         
}
     
     