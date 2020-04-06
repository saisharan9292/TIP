def func (Application,path) {
application_name = Application
println application_name
def inputFile = new File(path+"\\"+"app.properties")
def lines = inputFile.readLines()
if (application_name.equals("app1"))
{
String[] value_split = lines[0].split("\\|");
println value_split[1];
println value_split[2];
}
else if (application_name.equals("app2"))
{
String[] value_split = lines[1].split("\\|");
println "GITHUBURL=="+value_split[1]
println "Package=="+value_split[2]
}
else if (application_name.equals("app3"))
{
String[] value_split = lines[2].split("\\|");
println "GITHUBURL=="+value_split[1]
println "Package=="+value_split[2]
}
else if (application_name.equals("app4"))
{
String[] value_split = lines[3].split("\\|");
println "GITHUBURL=="+value_split[1]
println "Package=="+value_split[2]
}
else if (application_name.equals("app5"))
{
String[] value_split = lines[4].split("\\|");
println "GITHUBURL=="+value_split[1]
println "Package=="+value_split[2]
}
}
return this
