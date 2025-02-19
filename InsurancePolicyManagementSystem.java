import java.util.*;
import java.time.*;
class InsurancePolicy {
String policyNumber;
String policyholderName;
LocalDate expiryDate;
String coverageType;
double premiumAmount;
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
class InsurancePolicyManagementSystem {
Map<String, InsurancePolicy> policyMap = new HashMap<>();
Map<String, InsurancePolicy> orderedPolicyMap = new LinkedHashMap<>();
TreeMap<LocalDate, InsurancePolicy> sortedPolicyMap = new TreeMap<>();
public void addPolicy(InsurancePolicy policy) {
policyMap.put(policy.policyNumber, policy);
orderedPolicyMap.put(policy.policyNumber, policy);
sortedPolicyMap.put(policy.expiryDate, policy);
}
public InsurancePolicy getPolicyByNumber(String policyNumber) {
return policyMap.get(policyNumber);
}
public List<InsurancePolicy> getExpiringPolicies(int days) {
List<InsurancePolicy> expiringPolicies = new ArrayList<>();
LocalDate now = LocalDate.now();
LocalDate threshold = now.plusDays(days);
for (Map.Entry<LocalDate, InsurancePolicy> entry : sortedPolicyMap.entrySet()) {
if (entry.getKey().isAfter(now) && entry.getKey().isBefore(threshold)) {
expiringPolicies.add(entry.getValue());
}
}
return expiringPolicies;
}
public List<InsurancePolicy> getPoliciesByHolder(String policyholderName) {
List<InsurancePolicy> policies = new ArrayList<>();
for (InsurancePolicy policy : policyMap.values()) {
if (policy.policyholderName.equalsIgnoreCase(policyholderName)) {
policies.add(policy);
}
}
return policies;
}
public void removeExpiredPolicies() {
LocalDate now = LocalDate.now();
sortedPolicyMap.entrySet().removeIf(entry -> entry.getKey().isBefore(now));
policyMap.values().removeIf(policy -> policy.expiryDate.isBefore(now));
orderedPolicyMap.values().removeIf(policy -> policy.expiryDate.isBefore(now));
}
public static void main(String[] args) {
InsurancePolicyManagementSystem system = new InsurancePolicyManagementSystem();
system.addPolicy(new InsurancePolicy("P001", "John Doe", LocalDate.now().plusDays(20), "Health", 5000));
system.addPolicy(new InsurancePolicy("P002", "Alice Smith", LocalDate.now().plusDays(10), "Auto", 3000));
system.addPolicy(new InsurancePolicy("P003", "John Doe", LocalDate.now().minusDays(5), "Life", 7000));
System.out.println("Policy by Number P001: " + system.getPolicyByNumber("P001"));
System.out.println("Expiring Policies: " + system.getExpiringPolicies(30));
System.out.println("Policies for John Doe: " + system.getPoliciesByHolder("John Doe"));
system.removeExpiredPolicies();
System.out.println("Policies after removing expired: " + system.policyMap);
}
}
