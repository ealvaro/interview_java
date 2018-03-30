import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/*

Amazon wants to send emails to the customers acording to their spending profiles.

There are 3 messages:

1 - to 25% of customers who spent the most on the site
2 - to 25% of customers who spend the least on the site
3 - to all the other customers

Given a list of all purchases made in period of time, write a function
that correctly sends the messages to the customers.

*/
class Solution5 {

	public interface MessageSender {
		public void sendMessage(long customerId, int messageId);
	}

	public class Purchase {
		long customerId;
		double amount;

		// getters/setters/constructors/etc
	}

	public class CustomerExpenditure implements Comparable<Object> {
		private long customerId;
		private double totalSpent;

		CustomerExpenditure(long customerId, double amount) {
			this.customerId = customerId;
			this.setTotalSpent(amount);
		}

		public int compareTo(Object anotherExpenditure) {
			double total = ((CustomerExpenditure) anotherExpenditure).getTotalSpent();
			if (total < this.getTotalSpent()) {
				return -1;
			} else {
				if (total == this.getTotalSpent()) {
					return 0;
				} else {
					return 1;
				}
			}
		}

		public double getTotalSpent() {
			return totalSpent;
		}

		public void setTotalSpent(double totalSpent) {
			this.totalSpent = totalSpent;
		}

	}

	public void sendMessages(MessageSender messageSender, ArrayList<Purchase> purchases) {

		final double percent = 0.25;
		HashMap<Long, CustomerExpenditure> hmap = new HashMap<Long, CustomerExpenditure>();
		// Total the purchases
		for (Purchase p : purchases) {
			CustomerExpenditure customerExpenditure = hmap.get(p.customerId);
			if (customerExpenditure == null)
				hmap.put(p.customerId, new CustomerExpenditure(p.customerId, p.amount));
			else
				customerExpenditure.setTotalSpent(customerExpenditure.getTotalSpent() + p.amount);
		}

		// Sort purchases
		ArrayList<CustomerExpenditure> expenditures = new ArrayList<CustomerExpenditure>(hmap.values());
		Collections.sort(expenditures);

		// Top percent% message
		for (int i = (int) (expenditures.size() * (1.0-percent)); i < expenditures.size(); i++) {
			messageSender.sendMessage(expenditures.get(i).customerId, 1);
		}

		// Low percent% message
		for (int i = 0; i < expenditures.size() * percent; i++) {
			messageSender.sendMessage(expenditures.get(i).customerId, 2);
		}

		// rest of customers message
		for (int i = (int) (expenditures.size() * percent); i < expenditures.size() * (1.0 - percent); i++) {
			messageSender.sendMessage(expenditures.get(i).customerId, 3);
		}
	}
}
