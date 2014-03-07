package com.jsonreader.app.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class ContentProvider {

    /**
     * An array of sample (dummy) items.
     */
    private List<Post> POSTS = new ArrayList<Post>();
    private Map<String, Post> POSTS_MAP = new HashMap<String, Post>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public ContentProvider() {
        getContent();
    }

    public List<Post> getItems() {
        return POSTS;
    }

    public Map<String, Post> getItemMap() {
        return POSTS_MAP;
    }

    private void getContent() {
        // Add 3 sample items.
        addItem(new Post("1", "Item 1"));
        addItem(new Post("2", "Item 2"));
        addItem(new Post("3", "Item 3"));
    }

    private void addItem(Post item) {
        POSTS.add(item);
        POSTS_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class Post {
        public String id;
        public String content;

        public Post(String id, String content) {
            this.id = id;
            this.content = content;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
