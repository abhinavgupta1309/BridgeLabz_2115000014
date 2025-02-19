import java.util.*;
import java.time.*;

class InsurancePolicy {
public String policyNumber;
public String policyholderName;
public LocalDate expiryDate;
public String coverageType;
public double premiumAmount;

public InsurancePolicy(String policyNumber, String policyholderName, LocalDate expiryDate, String coverageType, double premiumAmount) {
this.policyNumber = policyNumber;
this.policyholderName = policyholderName;
this.expiryDate = expiryDate;
this.coverageType = coverageType;
this.premiumAmount = premiumAmount;
}

public String toString() {
return "PolicyNumber: " + policyNumber + ", Holder: " + policyholderName + ", Expiry: " + expiryDate + ", Coverage: " + coverageType + ", Premium: " + premiumAmount;
}
}

class PolicyStorage {
public static void main(String[] args) {
Set<InsurancePolicy> hashSet = new HashSet<>();
Set<InsurancePolicy> linkedHashSet = new LinkedHashSet<>();
Set<InsurancePolicy> treeSet = new TreeSet<>(Comparator.comparing(p -> p.expiryDate));

InsurancePolicy p1 = new InsurancePolicy("P001", "Heisenberg", LocalDate.now().plusDays(20), "Health", 5000);
InsurancePolicy p2 = new InsurancePolicy("P002", "Walter White", LocalDate.now().plusDays(10), "Auto", 3000);
InsurancePolicy p3 = new InsurancePolicy("P003", "Jessie Pinkman", LocalDate.now().plusDays(40), "Home", 7000);

long startTime, endTime;

startTime = System.nanoTime();
hashSet.add(p1); hashSet.add(p2); hashSet.add(p3);
endTime = System.nanoTime();
System.out.println("HashSet Add Time: " + (endTime - startTime) + " ns");

startTime = System.nanoTime();
linkedHashSet.add(p1); linkedHashSet.add(p2); linkedHashSet.add(p3);
endTime = System.nanoTime();
System.out.println("LinkedHashSet Add Time: " + (endTime - startTime) + " ns");

startTime = System.nanoTime();
treeSet.add(p1); treeSet.add(p2); treeSet.add(p3);
endTime = System.nanoTime();
System.out.println("TreeSet Add Time: " + (endTime - startTime) + " ns");

System.out.println("All Unique Policies: " + hashSet);
System.out.println("Policies in Insertion Order: " + linkedHashSet);
System.out.println("Policies Sorted by Expiry Date: " + treeSet);
}
}

class PolicyRetrieval {
public static void main(String[] args) {
Set<InsurancePolicy> treeSet = new TreeSet<>(Comparator.comparing(p -> p.expiryDate));

InsurancePolicy p1 = new InsurancePolicy("P001", "Heisenberg", LocalDate.now().plusDays(20), "Health", 5000);
InsurancePolicy p2 = new InsurancePolicy("P002", "Walter White", LocalDate.now().plusDays(10), "Auto", 3000);
InsurancePolicy p3 = new InsurancePolicy("P003", "Jessie Pinkman", LocalDate.now().plusDays(40), "Home", 7000);

treeSet.add(p1); treeSet.add(p2); treeSet.add(p3);

LocalDate today = LocalDate.now();
System.out.println("Policies expiring within 30 days:");
for (InsurancePolicy policy : treeSet) {
if (policy.expiryDate.isBefore(today.plusDays(30))) {
System.out.println(policy);
}
}
}
}
