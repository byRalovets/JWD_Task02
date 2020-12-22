package by.ralovets.epamcourse.resource;

import java.io.File;
import java.net.URL;
import java.util.HashMap;

public final class ResourceProvider {

    private static final HashMap<String, String> resources = new HashMap<>();

    public static File getLocalFile(String resourceKey)
            throws ResourceProviderException {

        String resourceName = resources.get(resourceKey);
        URL url = ResourceProvider.class
                .getClassLoader()
                .getResource(resourceName);

        if (url == null) {
            throw new ResourceProviderException();
        }

        return new File(url.getFile());
    }

    public static void putResource(String resourceKey, String resourceName) {
        resources.put(resourceKey, resourceName);
    }
}