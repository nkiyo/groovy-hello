// ProcessBuilder サンプル
ProcessBuilder p = new ProcessBuilder("cmd.exe /C echo hoge");
//ProcessBuilder p = new ProcessBuilder("cmd.exe", "/C", "echo", "hoge", "&", "echo", "hage");
Process proc = p.start();
proc.waitFor();

BufferedReader r = new BufferedReader(new InputStreamReader(proc.getInputStream())); 
String line;
while ((line = r.readLine()) != null) {
    println line
}
