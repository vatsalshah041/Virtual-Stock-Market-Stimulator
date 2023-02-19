import java.util.*;
import java.math.*;
class ed
{
   static int k3;
   static int[] bt={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
   static int[] share={0,800,500,600,550,400,150};
   static int[] itc=new int[100];static int[] ril=new int[100];static int[] tis=new int[100];
   static int[] ap=new int[100];static int[] gr=new int[100];static int[] bp=new int[100];
   static int n=0;
   Scanner cs=new Scanner(System.in);
   int ITC=800,RIL=500,BP=150,GR=400,TIS=600,AP=550;double s1,s2,s3,s4,s5;
   static int[] mon=new int[100];
   void FV(String[] Name)
   {
       System.out.println("Face value Price Of:"+"\n1:ITC=800"+"\n2:Reliance=500"+"\n3:Tisco=600"+"\n4:Asian Paint=550"+"\n5:Grasim=400"+"\n6:Blowpast=150");
       for(int z=0;z<=n;z++)
       {
           if(z!=0)
           {
               System.out.println("Does "+Name[z]+" want buy any share At face value,Y for yes,N for No");
               char o=cs.next().charAt(0);
               while(o=='y'||o=='Y')
               {
                   System.out.println("which SHARE do you want to buy?");
                   int sh=cs.nextInt();
                   if(sh>=1&&sh<=6)
                   {
                       System.out.println("How Many Shares do you want to BUY?");
                       int q=cs.nextInt();
                       if((q*share[sh])<=mon[z])
                       {
                           mon[z]=mon[z]-(q*share[sh]);
                           System.out.println("TOTAL="+(q*share[sh]));
                           if(sh==1)itc[z]=q;if(sh==2)ril[z]=q;if(sh==3)tis[z]=q;
                           if(sh==4)ap[z]=q;if(sh==5)gr[z]=q;if(sh==6)bp[z]=q;
                           break;
                       }
                       else
                       {
                           System.out.println("Insufficient money");
                       }
                   }
                   else
                   {
                       System.out.println("Please select correct number");
                   }
               }
           }
       }
       System.out.println();
       System.out.println("    DISPLAY             DISPLAY             DISPLAY             DISPLAY");
       System.out.println();
       for(int z=0;z<=n;z++)
       {
           if(z!=0)
           System.out.println("Player "+Name[z]+" has:"+"\n"+"ITC="+itc[z]+" Reliance="+ril[z]+" Tisco="+tis[z]+" Asian paint="+ap[z]+" GRASIM="+gr[z]+" Blow plast="+bp[z]+"           Money Left:"+mon[z]);
       }
   }
   void price(int p)
   {
       switch(p)
       {
            case 1:
            s1=Math.random();
            s2=Math.random();
            //System.out.println(s1);
            //System.out.println(s2);
            s3=Math.random();
            s4=Math.random();
            s5=Math.random();
            if(s1<=0.7)
            {
                if(share[1]>0)
                {
                if(s1<=0.1)
                {
                    share[1]=share[1]+50;
                }
                if(s1>0.1&&s1<=0.2)
                {
                    share[1]=share[1]+100;
                }
                if(s1>0.2&&s1<=0.25)
                {
                    share[1]=share[1]+50;
                }
                if(s1>0.35&&s1<=0.45)
                {
                    share[1]=share[1]-50;
                }
                if(s1>0.45&&s1<=0.6)
                {
                    share[1]=share[1]-100;
                }
                /*if(s1>0.65&&s1<=0.7)
                {
                    share[1]=share[1]-150;
                }*/
                }
            else
              {
                  share[1]=0;
                  for(int z=0;z<=n;z++)
                  {
                     if(z!=0)
                     {
                         itc[z]=0;
                     }
                  }
              }
            }
            System.out.println("ITC:"+share[1]);
            if(s2<=0.5)
            {
                if(share[2]>=0)
                {
                if(s2<=0.1)
                {
                    share[2]=share[2]+50;
                }
                if(s2>0.1&&s2<=0.2)
                {
                    share[2]=share[2]+100;
                }
                if(s2>0.2&&s2<=0.25)
                {
                    share[2]=share[2]+150;
                }
                if(s2>.25&&s2<=0.45)
                {
                    share[2]=share[2]-50;
                }
                if(s2>0.45&&s2<=0.6)
                {
                    share[2]=share[2]-150;
                }
                /*if(s2>0.6&&s2<=0.7)
                {
                    share[2]=share[2]-150;
                }*/
                }
                else
              {
                  share[2]=0;
                  for(int z=0;z<=n;z++)
                  {
                     if(z!=0)
                     {
                         ril[z]=0;
                     }
                  }
              }
            }
            System.out.println("RELIANCE:"+share[2]);
            if(s3<=0.5)
            {
                if(share[5]>=0)
                {
                if(s3<=0.1)
                {
                    share[5]=share[5]+50;
                }
                if(s3>0.1&&s3<=0.2)
                {
                    share[5]=share[5]+100;
                }
                if(s3>0.2&&s3<=0.25)
                {
                    share[5]=share[5]+50;
                }
                if(s3>.25&&s3<=0.45)
                {
                    share[5]=share[5]-50;
                }
                if(s3>0.45&&s3<=0.6)
                {
                    share[5]=share[5]-100;
                }
                /*if(s3>0.6&&s3<=0.7)
                {
                    share[5]=share[5]-150;
                }*/
                }
                else
              {
                  share[5]=0;
                  for(int z=0;z<=n;z++)
                  {
                     if(z!=0)
                     {
                         gr[z]=0;
                     }
                  }
              }
            }
            System.out.println("GRASIM:"+share[5]);
            if(s4<=0.5)
            {
                if(share[4]>=0)
                {
                if(s4<=0.1)
                {
                    share[4]=share[4]+50;
                }
                if(s4>0.1&&s4<=0.2)
                {
                    share[4]=share[4]+100;
                }
                if(s4>0.2&&s4<=0.25)
                {
                    share[4]=share[4]+50;
                }
                if(s4>.25&&s4<=0.45)
                {
                    share[4]=share[4]-50;
                }
                if(s4>0.45&&s4<=0.6)
                {
                    share[4]=share[4]-100;
                }
                /*if(s4>0.6&&s4<=0.7)
                {
                    share[4]=share[4]-150;
                }*/
                }
                else
              {
                  share[4]=0;
                  for(int z=0;z<=n;z++)
                  {
                     if(z!=0)
                     {
                         ap[z]=0;
                     }
                  }
              }
            }
            System.out.println("ASIAN PAINTS:"+share[4]);
            if(s5<=0.7)
            {
                if(share[3]>=0)
                {
                if(s5<=0.1)
                {
                    share[3]=share[3]+50;
                }
                if(s5>0.1&&s5<=0.2)
                {
                    share[3]=share[3]+100;
                }
                if(s5>0.2&&s5<=0.25)
                {
                    share[3]=share[3]+50;
                }
                if(s5>0.25&&s5<=0.45)
                {
                    share[3]=share[3]-50;
                }
                if(s5>0.45&&s5<=0.65)
                {
                    share[3]=share[3]-100;
                }
                /*if(s5>0.65&&s5<=0.7)
                {
                    share[3]=share[3]-150;
                }*/
                }
            else
              {
                  share[5]=0;
                  for(int z=0;z<=n;z++)
                  {
                     if(z!=0)
                     {
                         tis[z]=0;
                     }
                  }
              }
            }
            System.out.println("TISCO:"+share[3]);
            if(s5<=0.7)
            {
                if(share[6]>0)
                {
                if(s5<=0.1)
                {
                    share[6]=share[6]+50;
                }
                if(s5>0.1&&s5<=0.2)
                {
                    share[6]=share[6]+100;
                }
                if(s5>0.2&&s5<=0.25)
                {
                    share[6]=share[6]+50;
                }
                if(s5>0.3&&s5<=0.45)
                {
                    share[6]=share[6]-50;
                }
                if(s5>0.45&&s5<=0.6)
                {
                    share[6]=share[6]-100;
                }
                if(s5>0.65&&s5<=0.7)
                {
                    share[6]=share[6]-50;
                }
            }
            else
              {
                  share[6]=0;
                  for(int z=0;z<=n;z++)
                  {
                     if(z!=0)
                     {
                         bp[z]=0;
                     }
                  }
              }
            }
            System.out.println("Blow past:"+share[6]);
      }
   }
   int calamity(int n1,String[] name1)
   {
       int k=0;int str=0;
       for(int i=1;i<=n1;i++)
       {
           double cal1=Math.random();
           if((cal1*4)<0.6)
           {
               System.out.println();
               System.out.println("! ! ! ! EMERGENCY ! ! ! !");
               System.out.println(name1[i]+" has been struck pay 4000");
               System.out.println();
               k=1;
               str=i;
           }
           if(k==1)
           break;
       }
       if(k==1)
       {
           while(true)
         {
           System.out.println("If you want to pay from Cash In Hand("+mon[str]+") enter 1,if you want to pay by selling shares enter 2");
           int ch=cs.nextInt();
           if(ch==1)
           {
               if(mon[str]>=4000)
               {
                   mon[str]=mon[str]-4000;
                   System.out.println();
                   System.out.println("Money left("+name1[str]+")"+mon[str]);
                   System.out.println("! ! ! ! !PAYMENT DONE! ! ! ! !");
                   System.out.println();
                   break;
               }
               if(mon[str]<4000)
               {
                   System.out.println("Insufficient Funds");
               }
           }
           if(ch==2)
           {
               if((itc[str]==0)&&(ril[str]==0)&&(tis[str]==0)&&(ap[str]==0)&&(gr[str]==0)&&(bp[str]==0)&&(mon[str]<=4000))
               {
                   bt[str]=1;
                   k3=1;
                   break;
               }
               System.out.println("Which Share do you want to sell?");
               System.out.println("1 for ITC,2 for Reliance,3 for Tisco,4 for Asian Paint,5 for Grasim,6 for Blow PLast");
               int se=cs.nextInt();
               if(se==1)
               {
                   System.out.println("How many share do want to sell?"+"\n"+"(You have "+itc[str]+" shares)");
                   int sell=cs.nextInt();
                   if(sell<=itc[str])
                   {
                       itc[str]=itc[str]-sell;
                       //System.out.println("! ! ! ! !PAYMENT DONE! ! ! ! !");
                       mon[str]=mon[str]+(sell*share[1]);
                   }
                   else
                   {
                       System.out.println("! ! ! ! !Insuffient Shares! ! ! ! !");
                   }
               }
               if(se==2)
               {
                   System.out.println("How many share do want to sell?"+"\n"+"(You have "+ril[str]+" shares)");
                   int sell=cs.nextInt();
                   if(sell<=ril[str])
                   {
                       ril[str]=ril[str]-sell;
                       //System.out.println("! ! ! ! !PAYMENT DONE! ! ! ! !");
                       mon[str]=mon[str]+(sell*share[2]);
                   }
                   else
                   {
                       System.out.println("! ! ! ! !Insuffient Shares! ! ! ! !");
                   }
               }
               if(se==3)
               {
                   System.out.println("How many share do want to sell?"+"\n"+"(You have "+tis[str]+" shares)");
                   int sell=cs.nextInt();
                   if(sell<=tis[str])
                   {
                       tis[str]=tis[str]-sell;
                       //System.out.println("! ! ! ! !PAYMENT DONE! ! ! ! !");
                       mon[str]=mon[str]+(sell*share[3]);
                   }
                   else
                   {
                       System.out.println("! ! ! ! !Insuffient Shares! ! ! ! !");
                   }
               }
               if(se==4)
               {
                   System.out.println("How many share do want to sell?"+"\n"+"(You have "+ap[str]+" shares)");
                   int sell=cs.nextInt();
                   if(sell<=ap[str])
                   {
                       ap[str]=ap[str]-sell;
                       //System.out.println("! ! ! ! !PAYMENT DONE! ! ! ! !");
                       mon[str]=mon[str]+(sell*share[4]);
                   }
                   else
                   {
                       System.out.println("! ! ! ! !Insuffient Shares! ! ! ! !");
                   }
               }
               if(se==5)
               {
                   System.out.println("How many share do want to sell?"+"\n"+"(You have "+gr[str]+" shares)");
                   int sell=cs.nextInt();
                   if(sell<=gr[str])
                   {
                       gr[str]=gr[str]-sell;
                       //System.out.println("! ! ! ! !PAYMENT DONE! ! ! ! !");
                       mon[str]=mon[str]+(sell*share[5]);
                   }
                   else
                   {
                       System.out.println("! ! ! ! !Insuffient Shares! ! ! ! !");
                   }
               }
               if(se==6)
               {
                   System.out.println("How many share do want to sell?"+"\n"+"(You have "+bp[str]+" shares)");
                   int sell=cs.nextInt();
                   if(sell<=bp[str])
                   {
                       bp[str]=bp[str]-sell;
                       //System.out.println("! ! ! ! !PAYMENT DONE! ! ! ! !");
                       mon[str]=mon[str]+(sell*share[6]);
                   }
                   else
                   {
                       System.out.println("! ! ! ! !Insuffient Shares! ! ! ! !");
                   }
               }
           }
         }
       }
       return str;
   }
   void transaction(String name2[])
   {
       int f=1;
       for(int z=0;z<=n;z++)
       {
           if(z!=0)
           {
               System.out.println("For player '"+name2[z]+"':");
               System.out.println("For Buying press 1,and for Selling press 2");
               int t=cs.nextInt();
               if(t==1)
               {
                   System.out.println("Which share do you want to Buy:");
                   if(f==1)
                   System.out.println("1:ITC"+"\n2:Reliance"+"\n3:Tisco"+"\n4:Asian Pint"+"\n5:Grasim"+"\n6:Blowpast");
                   f++;
                   int sh=cs.nextInt();
                   if(sh>=1&&sh<=6)
                   {
                       while(true)
                       {
                           System.out.println("How Many Share do you want to Buy?");
                           int q=cs.nextInt();
                           if((q*share[sh])<=mon[z])
                           {
                               mon[z]=mon[z]-(q*share[sh]);
                               System.out.println("TOTAL="+(q*share[sh]));
                               if(sh==1)itc[z]=itc[z]+q;if(sh==2)ril[z]=ril[z]+q;if(sh==3)tis[z]=tis[z]+q;
                               if(sh==4)ap[z]=ap[z]+q;if(sh==5)gr[z]=gr[z]+q;if(sh==6)bp[z]=bp[z]+q;
                               break;
                           }
                           else
                           {
                               System.out.println("Insufficient money");
                           }
                       }
                   }
                       else
                       {
                       
                       }
               }
               if(t==2)
               {
                   System.out.println("Which share do you want to SELL:");
                   if(f==1)
                   System.out.println("1:ITC"+"\n2:Reliance"+"\n3:Tisco"+"\n4:Asian Pint"+"\n5:Grasim"+"\n6:Blowpast");
                   f++;
                   int sh=cs.nextInt();
                   if(sh>=1&&sh<=6)
                   {
                       while(true)
                       {
                           System.out.println("How Many Share do you want to SELL?");
                           int q=cs.nextInt();
                           if((sh==1&&q<=itc[z])||(sh==2&&q<=ril[z])||(sh==3&&q<=tis[z])||(sh==4&&q<=ap[z])||(sh==5&&q<=gr[z])||(sh==6&&q<=bp[z]))
                           {
                               mon[z]=mon[z]+(q*share[sh]);
                               System.out.println("TOTAL="+(q*share[sh]));
                               if(sh==1)itc[z]=itc[z]-q;if(sh==2)ril[z]=ril[z]-q;if(sh==3)tis[z]=tis[z]-q;
                               if(sh==4)ap[z]=ap[z]-q;if(sh==5)gr[z]=gr[z]-q;if(sh==6)bp[z]=bp[z]-q;
                               break;
                           }
                           else
                           {
                               System.out.println("NOT ENOUGH SHARES");
                           }
                       }
                   }
               }   
           }
       }
       System.out.println();
       System.out.println("    DISPLAY             DISPLAY             DISPLAY             DISPLAY");
       System.out.println();
       for(int z=0;z<=n;z++)
       {
           if(z!=0)
           System.out.println("Player "+name2[z]+" has:"+"\n"+"ITC="+itc[z]+" Reliance="+ril[z]+" Tisco="+tis[z]+" Asian paint="+ap[z]+" GRASIM="+gr[z]+" Blow plast="+bp[z]+"           Money Left:"+mon[z]);
       }
   }
   void display(String[] name3)
   {
       for(int i=0;i<=n;i++)
       {
           if(i!=0)
           {
               System.out.println(name3[i]);
           }
       }
   }
   public static void main(String []args)
   {
       int k1=0;
       int flag=0;
       int[] money=new int[100];
       ed abc=new ed();
       int a=1;
       String[] name=new String[100];
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the no. of players");
       n=sc.nextInt();
       System.out.println("enter name");
       for(int z=0;z<=n;z++)
       {
           name[z]=sc.nextLine();
       }
       System.out.print("REFERENCE NO. OF  ");
       for(int z=0;z<=n;z++)
       {
           if(z!=0)
           System.out.print(name[z]+" :  "+z+"     ");
       }
       System.out.println();
       for(int z=0;z<=n;z++)
       {
           mon[z]=15000;
       }
       for(int z=0;z<=n;z++)
       {
           if(z!=0)
           {
               itc[z]=0;ril[z]=0;ap[z]=0;bp[z]=0;tis[z]=0;gr[z]=0;
           }
       }
       abc.FV(name);
       while(a==1||a==2)
       {
           System.out.println("enter 1 for new value,2 for display");
           a=sc.nextInt();
           double cal=Math.random();
           if(a==1&&((cal>0&&cal<0.1)||(cal>0.35&&cal<0.4)||(cal>0.9)||(cal>0.6&&cal<0.65)))
           {
               k1=abc.calamity(n,name);
               
           }
           if(a==1)
           {
             abc.price(a);
             System.out.println("Do You want to do Transaction,Y for yes,N for no");
             char o=sc.next().charAt(0);
             if(o=='y'||o=='Y')
             abc.transaction(name);
           }
           if(k3==1)
           for(int btc=0;btc<=n;btc++)
           {
               if(btc!=0)
               {
                   if(bt[btc]==1)
                   {
                       System.out.println(name[btc]+" GOT BANKRUPT,SO CANNOT TAKE PART IN THIS GAME AGAIN");
                       int b1=0,b2=0,b3=0,b4=0,b5=0,b6=0,b7=0,b9=0;String b8="";
                       b1=mon[n];b2=itc[n];b3=ril[n];b4=tis[n];b5=ap[n];b6=gr[n];b7=bp[n];b8=name[n];b9=bt[n];
                       mon[n]=0;itc[n]=0;ril[n]=0;tis[n]=0;ap[n]=0;gr[n]=0;bp[n]=0;name[n]="";bt[n]=0;
                       mon[btc]=b1;itc[btc]=b2;ril[btc]=b3;tis[btc]=b4;ap[btc]=b5;gr[btc]=b6;bp[btc]=b7;name[btc]=b8;bt[btc]=b9;
                       n=n-1;k3=0;
                       
                       for(int i=0;i<=n;i++)
                       {
                            if(i!=0)
                            System.out.println(name[i]);
                       }
                       break;
                   }
               }
           }
           if(a==2)
           {
               abc.display(name);
           }
       }
   }
}