import static java.util.stream.Collectors.*;

def list = new ArrayList<String>(Arrays.asList("tokyo", "nagoya", "osaka", "fukuoka"));
//println list
//println list.get(1)
println "pre list = ${list}"

def list2 = list.stream().
    filter(e -> e.length() > 5).
    map(String::toUpperCase).
    collect(toList());
    //forEach(System.out::println);

println list2.getClass()
println "list2 ${list2}"

// TODO リストや内容のポインタの比較
// TODO importの仕方
