// ref => https://www.eeb.co.jp/wordpress/?p=232
List<String> a1 = Arrays.asList("d", "a", "b", "c", "d");
List<String> a2 = Arrays.asList("e", "d", "b", "b");

// List to Set
Set<String> s1 = new TreeSet<String>(a1);
println "set1 => " + s1
Set<String> s2 = new TreeSet<String>(a2);
println "set2 => " + s2

// s1 - s2 diff 
s1s2diff = new TreeSet<String>(s1);
s1s2diff.removeAll(s2);
ArrayList<String> s1s2diffList = new ArrayList<String>(s1s2diff);
println "set1 - set2 => " + s1s2diffList // => a, c

// s2 - s1 diff
s2s1diff = new TreeSet<String>(s2);
s2s1diff.removeAll(s1);
ArrayList<String> s2s1diffList = new ArrayList<String>(s2s1diff);
println "set2 - set1 => " + s2s1diffList // => e

