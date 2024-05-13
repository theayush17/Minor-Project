package Ayush9478;
import java.util.*;
class Date
{
    final int day, year;
    final String month;
    Date(int day, String month, int year)
    {
        this.day = day;
        this.year = year;
        this.month = month;
    }
    void display()
    {

    }
}

class Member extends Date
{
    private final int memberID, handicap, coach;
    private final String lastName, firstName, team, memberType, gender;
    private final long phone;
    //    Date joinDate;
    Member(int memberID, int handicap, int coach, String lastName, String firstName,
           String team, String memberType, String gender, long phone, int day, String month, int year)
    {
        super(day, month, year);
        this.memberID=memberID;      this.handicap=handicap;     this.coach=coach;
        this.lastName=lastName;      this.firstName=firstName;   this.team=team;
        this.memberType=memberType;  this.gender=gender;         this.phone=phone;
    }
    public void display()
    {
        System.out.printf("%-10d %-14s %-14s %-10d %-8s %-8s %-12s %-8d %-10d %-2d %-8s %-4d\n",
                memberID, lastName, firstName, handicap,
                gender, team, memberType, coach, phone, day, month, year);
    }
    public void display1()
    {
        String m, g, t;  int h;
        m= memberType;  h= handicap;    g= gender;  t= team;
        Scanner sc= new Scanner(System.in);
        while(true)
        {
            System.out.println("0.Exit \n1.Date below 07-Apr-2009 \n2.Senior member with handicap below 12 \n" +
                    "3.Senior female member of teamB: ");
            int ch= sc.nextInt();
            switch(ch)
            {
                case 0:
                {
                    System.exit(0);
                    break;
                }
                case 1:
                {
                    String header = "%-10s %-14s %-14s %-10s %-8s %-8s %-12s %-8s %-8s %-10s\n";
                    System.out.printf(header,
                            "Member-Id", "LastName", "FirstName", "Handicap", "Gender",
                            "Team", "MemberType", "Coach", "Phone", "JoinDate");
                    if(((day<31 && month!="April") || (day<7 && month=="April")) && year<2009)
                    {
                        System.out.printf("%-10d %-14s %-14s %-10d %-8s %-8s %-12s %-8d %-10d %-2d %-8s %-4d\n",
                                memberID, lastName, firstName, handicap,
                                gender, team, memberType, coach, phone, day, month, year);
                    }
                    break;
                }
                case 2:
                {
                    String header = "%-10s %-14s %-14s %-10s %-8s %-8s %-12s %-8s %-8s %-10s\n";
                    System.out.printf(header,
                            "Member-Id", "LastName", "FirstName", "Handicap", "Gender",
                            "Team", "MemberType", "Coach", "Phone", "JoinDate");
                    if((memberType.equalsIgnoreCase("senior") && handicap<12))
                    {
                        System.out.printf("%-10d %-14s %-14s %-10d %-8s %-8s %-12s %-8d %-10d %-2d %-8s %-4d\n",
                                memberID, lastName, firstName, h,
                                gender, team, m, coach, phone, day, month, year);
                    }
                    break;
                }
                case 3:
                {
                    String header = "%-10s %-14s %-14s %-10s %-8s %-8s %-12s %-8s %-8s %-10s\n";
                    System.out.printf(header,
                            "Member-Id", "LastName", "FirstName", "Handicap", "Gender",
                            "Team", "MemberType", "Coach", "Phone", "JoinDate");
                    if(memberType.equalsIgnoreCase("senior") &&
                            gender.equalsIgnoreCase("f") && team.equalsIgnoreCase("teamB"))
                    {
                        System.out.printf("%-10d %-14s %-14s %-10d %-8s %-8s %-12s %-8d %-10d %-2d %-8s %-4d\n",
                                memberID, lastName, firstName, handicap,
                                g, t, m, coach, phone, day, month, year);
                    }
                    break;
                }
                default:
                    System.out.println("Maa chuda");
            }
        }

//        if((memberType.equalsIgnoreCase("senior") && handicap<12) ||
//                (memberType.equalsIgnoreCase("senior") &&
//                        gender.equalsIgnoreCase("f") && team.equalsIgnoreCase("teamB")) ||
//                ((day<31 && month!="April") || (day<7 && month=="April")) && year<2009)
//        {
//            m= memberType;  h= handicap;    g= gender;  t= team;
//            System.out.printf("%-10d %-14s %-14s %-10d %-8s %-8s %-12s %-8d %-10d %-2d %-8s %-4d\n",
//                    memberID, lastName, firstName, h,
//                    g, t, m, coach, phone, day, month, year);
//        }
    }
}

public class Project
{
    public static void main(String[] args)
    {
        Scanner s1 = new Scanner(System.in); //int long
        Scanner s2 = new Scanner(System.in); //string
        Scanner s3 = new Scanner(System.in);
        Scanner s4 = new Scanner(System.in);
        Scanner s5 = new Scanner(System.in);
        Scanner s6 = new Scanner(System.in);
        Scanner s7 = new Scanner(System.in);
        Date[] d= new Date[2];
        Member[] m = new Member[2];
        for (int i = 0; i < 2; i++)
        {
            System.out.print("Enter your member-ID: ");
            int memberID = s1.nextInt();
            System.out.print("Enter your last name: ");
            String lastName = s2.nextLine();
            System.out.print("Enter your first name: ");
            String firstName = s3.nextLine();
            System.out.print("Enter your handicap: ");
            int handicap = s1.nextInt();
            System.out.print("Enter your gender(M/F): ");
            String gender = s4.next();
            System.out.print("Enter your Team: ");
            String team = s5.nextLine();
            System.out.print("Enter what member type you are?: ");
            String memberType = s6.nextLine();
            System.out.print("Enter coach: ");
            int coach = s1.nextInt();
            System.out.print("Enter your phone no: ");
            long phone = s1.nextLong();
            System.out.print("Enter joining date: ");
            int day = s1.nextInt();
            System.out.print("Enter joining month: ");
            String month = s7.nextLine();
            System.out.print("Enter joining year: ");
            int year = s1.nextInt();
            d[i]= new Date(day, month, year);
            m[i]= new Member(memberID, handicap, coach, lastName, firstName, team,
                    memberType, gender, phone, day, month, year);
        }
        String header = "%-10s %-14s %-14s %-10s %-8s %-8s %-12s %-8s %-8s %-10s\n";
        System.out.printf(header,
                "Member-Id", "LastName", "FirstName", "Handicap", "Gender",
                "Team", "MemberType", "Coach", "Phone", "JoinDate");
        for(int i=0; i<2; i++)
        {
            m[i].display();
            d[i].display();
        }
        System.out.println();
//        header = "%-10s %-14s %-14s %-10s %-8s %-8s %-12s %-8s %-8s %-10s\n";
//        System.out.printf(header,
//                "Member-Id", "LastName", "FirstName", "Handicap", "Gender",
//                "Team", "MemberType", "Coach", "Phone", "JoinDate");
        for(int i=0; i<2; i++)
        {
            m[i].display1();
        }
    }
}
