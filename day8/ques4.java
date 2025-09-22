package CP.day8;

public class ques4 {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;
        int profit = sellingPrice - costPrice;
        int profitPercentage = (profit * 100) / costPrice;
        System.out.println("The Cost Price is INR 129 and Selling Price is INR 191:");
        System.out.println("The Profit is INR " + profit + " and Profit Percentage is " + profitPercentage + "%");
    }
}
