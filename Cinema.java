class Cinema
{
    String movie;
    double price;
    int tickets;
    String customer;


    Cinema()
    {
        movie = "Unknown";
        price = 0;
        tickets = 0;
        customer = "Unknown";
    }

    Cinema(String m, double p, int t, String c)
    {
        movie = m;
        price = p;
        tickets = t;
        customer = c;
    }

    void book(int t)
    {
        tickets = t;
    }

    void book(int t, String c)
    {
        tickets = t;
        customer = c;
    }

    void display()
    {
        if (tickets <= 0)
        {
            System.out.println("Invalid number of tickets");
            return;
        }

        double total = price * tickets;

        if (tickets >= 5)
        {
            total = total - (total * 10 / 100);
        }

        System.out.println("Movie Name: " + movie.toUpperCase());
        System.out.println("Customer Name: " + customer.toUpperCase());
        System.out.println("Number of Tickets: " + tickets);
        System.out.println("Ticket Price: " + price);
        System.out.println("Total Amount: " + total);
    }

    public static void main(String args[])
    {
        Cinema c1 = new Cinema("Avengers", 200, 0, "Rahul");

        c1.book(3);
        c1.display();

        System.out.println();

        Cinema c2 = new Cinema("Avatar", 250, 0, "Priya");

        c2.book(5, "Priya");
        c2.display();

        System.out.println();

        if (c1.customer.equalsIgnoreCase(c2.customer))
        {
            System.out.println("Same customer");
        }
        else
        {
            System.out.println("Different customers");
        }
    }
}