package com.sye.bytes.lambdasandstreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PractiseLambdaAndStreams {

	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));

		// 1 Find all transactions in the year 2011 and sort them by value (small to high).
		filterAndSort(transactions);
		// 2 What are all the unique cities where the traders work?
		uniqueCities(transactions);
		// 3 Finds all traders from Cambridge and sort them by name
		cambridgeTradersSorted(transactions);
		// 4 Returns a string of all traders’ names sorted alphabetically
		sortedTradersNames(transactions);
		//5 Are any traders based in Milan?
		milanTraders(transactions); 
		//6 Prints all transactions’ values from the traders living in Cambridge	
		transactionValues(transactions);
		//7 What’s the highest value of all the transactions?
		maxTransactionValue(transactions);
		//8 Finds the transaction with the smallest value
		minTransactionValue(transactions);

	}

	// 1 Find all transactions in the year 2011 and sort them by value (small to
	// high).
	public static void filterAndSort(List<Transaction> transactions) {

		List<Transaction> sortedTransactions =
				transactions.stream()
							.filter(t -> t.getYear() == 2011)
							.sorted(Comparator.comparing(Transaction::getValue))
							.collect(Collectors.toList())
		;

		System.out.println(sortedTransactions);

	}

	// 2 What are all the unique cities where the traders work?
	public static void uniqueCities(List<Transaction> transactions) {

		List<String> uniqueCities =
				transactions.stream()
				            .map(t -> t.getTrader().getCity())
				            .distinct()
				            .collect(Collectors.toList())
		;	
	
		
		System.out.println(uniqueCities);
		
	}
	
	// 3 Finds all traders from Cambridge and sort them by name
	public static void cambridgeTradersSorted(List<Transaction> transactions) {
		
		List<Trader> traders = 
				transactions.stream()
							.map(t -> t.getTrader())
							.filter(t -> t.getCity().equals("Cambridge"))
							.sorted(Comparator.comparing(Trader::getName))
							.collect(Collectors.toList())
		;
		
		System.out.println(traders);
	}
	
	// 4 Returns a string of all traders’ names sorted alphabetically
	public static void sortedTradersNames(List<Transaction> transactions) {
		
		String traders = 
				transactions.stream()
							.map(t -> t.getTrader().getName()+" ")		
							.distinct()
							.sorted()
							.collect(Collectors.joining())
		;
		
		System.out.println(traders);
	}
	
	//5 Are any traders based in Milan?
	public static void milanTraders(List<Transaction> transactions) {
		
		/*Optional<String> milanTraders = 
				transactions.stream()
							.map(t -> t.getTrader().getCity())		
							.filter(city -> city.equals("Milan"))
							.findFirst()
		;
		
		System.out.println("Milan traders present "+milanTraders.isPresent());*/
		
		boolean milanBased =
				transactions.stream()
				.anyMatch(transaction -> transaction.getTrader()
				.getCity()
				.equals("Milan"));
		System.out.println("Milan traders present "+milanBased);
	}
	//6 Prints all transactions’ values from the traders living in Cambridge	
	public static void transactionValues(List<Transaction> transactions) {
		
		
		transactions.stream()
					.filter(t -> t.getTrader().getCity().equals("Cambridge"))
					.map(t -> t.getValue())		
					.forEach(System.out::println)
		;
		
		
	}	
	//7 What’s the highest value of all the transactions?
	public static void maxTransactionValue(List<Transaction> transactions) {
		
		
		Optional<Integer> max = transactions.stream()					
					.map(t -> t.getValue())		
					.reduce(Integer::max)
		;
		System.out.println("Max "+max.orElse(0));
		
	}
	//8 Finds the transaction with the smallest value
	public static void minTransactionValue(List<Transaction> transactions) {
		
		
		Optional<Transaction> minTransaction =
				transactions.stream()					
							.min(Comparator.comparing(Transaction::getValue))
		;
		System.out.println("Min "+minTransaction.get());
		
	}
}
