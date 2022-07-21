class extractFromUrl {
    public static void main(String[] args) {
        String str="https://target.com/index.html?pass=12345&port=8080&cookie=&host=localhost";
        String[] str1=str.split("?");
        System.out.println(str1);
        //String[] str2=str1[1].split("&");
        //System.out.println(str2[0].replace("=",":"));
    }
}