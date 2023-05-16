public class new {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        ArrayList<String> list=new ArrayList<>();
        rec(s,0,list,"");
        System.out.print(list);
        

    }
    public static void rec(String s,int i,ArrayList list,String ans){
        if(ans.length()==s.length()){
                list.add(s);
                return;
        }
        int aa=s.charAt(i);
        if(aa>=97&&aa<123){
            rec(s,i+1,list,s+s.charAt(i));
            rec(s,i+1,list,ans+(Character.toLowerCase(s.charAt(i)));

        }
        else if(aa>=65&&aa<=92){
            rec(s,i+1,list,s+s.charAt(i));
            rec(s,i+1,list,ans+(Character.toUpperCase(s.charAt(i)));
        }
        else{
            rec(s,i+1,list,s+s.charAt(i));
        }
    }
}
