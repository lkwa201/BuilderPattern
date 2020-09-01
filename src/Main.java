public class Main {
    public static void main(String[] args) {
	    UserInfoBuilder builder = new UserInfoBuilder();
        UserInfo user = builder.setName("addLee")
                .setAge(35)
                .setAddr("InCheon").build();
        System.out.println(user.getUserInfo());
    }
}
