package comportamentais.iterator.socialNetworks;

import comportamentais.iterator.iterators.ProfileIterator;

public interface SocialNetwork {
	ProfileIterator createFriendsIterator(String profileEmail);

	ProfileIterator createCoworkersIterator(String profileEmail);
}