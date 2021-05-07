package design_patterns.iterator.social_network.social_network;

import design_patterns.iterator.social_network.iterators.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);
    ProfileIterator createCoworkersIterator(String profileEmail);
}
