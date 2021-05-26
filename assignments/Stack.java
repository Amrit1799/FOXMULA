import java.util.*;
class Stack
{
    int max,top;
    int st[];

    Stack(int i)                                    //parameterized constructor
    {
        top=-1;
        max=i;
        st=new int[max];
    }

    void push(int data)                                 //push function
    {
        if (top==max)
            System.out.println("Stack Overflow");
        else
            st[++top]=data;
    }

    int pop()                                           // pop function
    {
        if (top==-1)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
            return st[--top];
    }

    boolean checkEmpty()                            // checkEmpty function
    {
        if (max==-1)
            return true;
        else
            return false;
    }

    int count()                                     //count elements in stack
    {
        return (top>-1?top+1:0);
    }

    void display(Stack s1,Stack s2)
    {
        if(s1.count()==s2.count())
            System.out.println("Number of elements"+s1.count());
    }




    public static void main(String args[]) 
    {
        Scanner sc= new Scanner(System.in);
        Stack s1=new Stack(5);
        Stack s2=new Stack(5);

        int ch,data;

        while(true)                                 //menu driver
        {
        System.out.println("\n1. Push stack 1");
        System.out.println("2. Push stack 2");
        System.out.println("3. Pop stack 1");
        System.out.println("4. Pop stack 2");
        System.out.println("Enter choice : ");
        ch=sc.nextInt();
                

        switch(ch)
        {
        case 1:
            System.out.println("Enter data");
            data=sc.nextInt();
            s1.push(data);
            s1.display(s1,s2);
            break;
        case 2:
            System.out.println("Enter data");
            data=sc.nextInt();
            s2.push(data);
            s1.display(s1,s2);
            break;
        case 3:
            System.out.println(s1.pop());
            s1.display(s1,s2);
            break;
        case 4:
            System.out.println(s2.pop());
            s1.display(s1,s2);
            break;
        default:
            System.out.println("Exit");
        }
        if(ch>4)
            break;        
    }
}

}