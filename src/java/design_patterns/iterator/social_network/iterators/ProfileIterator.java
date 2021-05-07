package design_patterns.iterator.social_network.iterators;

import design_patterns.iterator.social_network.Profile;

public interface ProfileIterator {
    boolean hasNext();
    Profile getNext();
    void reset();
}
