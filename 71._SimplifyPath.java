class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack=new Stack<>();
        String[] vals= path.split("/");
        for(String val: vals){
            if(val.equals("..")&&!stack.isEmpty()){
                stack.pop();
            }
            else if (!val.equals(".")&&!val.equals("..")&&!val.equals("")){
                stack.push(val);
            }
        }
        return "/"+ String.join("/",stack);
    }
}
