package filecreator;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;


public class Userservice {
	List<User> users = new ArrayList<User>();
	public void addUser()
	{
		
	}
	public List<User> loadUsers() throws IOException
	{
		File f = new File("TEXT");
		
		
		if(f.exists())
		{
			BufferedReader br = new BufferedReader(new FileReader(f));
			
			
			String st;
			while ((st =br.readLine()) != null)
			{
				String[] splitNames = st.split(" ");
						User u = new User();
				u.setFirst_name(splitNames[0]);
				if(splitNames.length > 2) {
					u.setMiddle_name(splitNames[1]);
					u.setLast_name(splitNames[2]);
					
				}
				else
				{
					u.setLast_name(splitNames[1]);
				}
				users.add(u);
			}
			
		}
		return users;
	}
	public static void main(String[] args)
	{
		Userservice rf = new Userservice();
		try
		{
			List<User> users = rf.loadUsers();
			for(User user : users)
			{
				System.out.println(user.getFirst_name() + " " + user.getLast_name());
			}
		}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		} 
	}
	


