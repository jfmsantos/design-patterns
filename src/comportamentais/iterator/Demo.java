package comportamentais.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import comportamentais.iterator.profile.Profile;
import comportamentais.iterator.socialNetworks.Facebook;
import comportamentais.iterator.socialNetworks.LinkedIn;
import comportamentais.iterator.socialNetworks.SocialNetwork;
import comportamentais.iterator.socialSpammer.SocialSpammer;

public class Demo {
	private static final String ANNA_SMITH_BING_COM = "anna.smith@bing.com";
	public static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Please specify social network to target spam tool (default:Facebook):");
        System.out.println("1. Facebook");
        System.out.println("2. LinkedIn");
        String choice = scanner.nextLine();

        SocialNetwork network;
        if (choice.equals("2")) {
            network = new LinkedIn(createTestProfiles());
        }
        else {
            network = new Facebook(createTestProfiles());
        }

        SocialSpammer spammer = new SocialSpammer(network);
        spammer.sendSpamToFriends(ANNA_SMITH_BING_COM,
                "Hey! This is Anna's friend Josh. Can you do me a favor and like this post [link]?");
        spammer.sendSpamToCoworkers(ANNA_SMITH_BING_COM,
                "Hey! This is Anna's boss Jason. Anna told me you would be interested in [link].");

	}
	
	public static List<Profile> createTestProfiles() {
        List<Profile> data = new ArrayList<>();
        data.add(new Profile(ANNA_SMITH_BING_COM, "Anna Smith", "friends:mad_max@ya.com", "friends:catwoman@yahoo.com", "coworkers:sam@amazon.com"));
        data.add(new Profile("mad_max@ya.com", "Maximilian", "friends:anna.smith@bing.com", "coworkers:sam@amazon.com"));
        data.add(new Profile("bill@microsoft.eu", "Billie", "coworkers:avanger@ukr.net"));
        data.add(new Profile("avanger@ukr.net", "John Day", "coworkers:bill@microsoft.eu"));
        data.add(new Profile("sam@amazon.com", "Sam Kitting", "coworkers:anna.smith@bing.com", "coworkers:mad_max@ya.com", "friends:catwoman@yahoo.com"));
        data.add(new Profile("catwoman@yahoo.com", "Liza", "friends:anna.smith@bing.com", "friends:sam@amazon.com"));
        return data;
    }
}