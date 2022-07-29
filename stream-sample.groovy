import static java.util.stream.Collectors.toList;

List<String> list1 = Arrays.asList("tokyo", "nagoya", "osaka", "fukuoka");
//List<String> list1 = new ArrayList<String>(Arrays.asList("tokyo", "nagoya", "osaka", "fukuoka"));
//println list1
//println list1.get(1)
println "pre list = ${list1}"

List<String> list2 = list1.stream().
    filter(e -> e.length() > 5).
    map(String::toUpperCase). // TODO これは何？
    collect(toList());
    //forEach(System.out::println);

println "list2 ${list2}"

// TODO リストや内容のポインタの比較
// TODO importの仕方
// https://www.baeldung.com/java-8-collectors
// https://qiita.com/nesheep5/items/da42df92397285d4ad0f
