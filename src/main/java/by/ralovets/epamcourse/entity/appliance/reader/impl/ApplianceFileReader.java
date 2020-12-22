package by.ralovets.epamcourse.entity.appliance.reader.impl;

import by.ralovets.epamcourse.entity.appliance.reader.ApplianceReader;
import by.ralovets.epamcourse.entity.appliance.reader.ApplianceReaderException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ApplianceFileReader implements ApplianceReader {

    private final Iterator<String> streamIterator;

    public ApplianceFileReader(File file) throws ApplianceReaderException {
        FileReader fileReader;
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException ignored) {
            throw new ApplianceReaderException();
        }

        streamIterator = new BufferedReader(fileReader).lines().iterator();
    }

    @Override
    public boolean hasNext() {
        return streamIterator.hasNext();
    }

    @Override
    public String next() {
        return streamIterator.next();
    }

    public List<String> next(int count) {
        int i = 0;

        List<String> values = new ArrayList<>();
        while (i < count && streamIterator.hasNext()) {
            values.add(streamIterator.next());
            i++;
        }

        return values;
    }
}


