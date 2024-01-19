package src.oops13jan2024.encapusalation.GS;

public class BadExample {
    public static void main(String[] args) {
        vwologin vwologin = new vwologin("admin", "admin");
        boolean check = vwologin.isLoggedIn("admin","password");
        vwologin.setUsername("admin");
        System.out.println(vwologin.getPassword());
        boolean check2 = vwologin.isLoggedIn("admin","password");
        System.out.println(check2);
    }
}
    class vwologin {


        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        private String username;

        public String getPassword() {
            return password;
        }


        private String password;

        public vwologin(String username, String password) {
            this.username = username;
            this.password = password;

        }

        boolean isLoggedIn(String username, String password) {
            if (this.username.toLowerCase().equals(username) && this.password.toLowerCase().equals(password)) {

                System.out.println("Logged In");
                return true;
            } else {
                System.out.println("Wrong");
                return false;
            }


        }
    }






