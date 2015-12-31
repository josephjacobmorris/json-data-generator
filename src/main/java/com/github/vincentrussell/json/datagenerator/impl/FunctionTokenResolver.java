package com.github.vincentrussell.json.datagenerator.impl;


import com.github.vincentrussell.json.datagenerator.TokenResolver;
import com.github.vincentrussell.json.datagenerator.functions.ObjectRegistry;
import com.github.vincentrussell.json.datagenerator.parser.FunctionParser;
import com.github.vincentrussell.json.datagenerator.parser.ParseException;

import java.io.ByteArrayInputStream;
import java.util.regex.Pattern;

public class FunctionTokenResolver implements TokenResolver {

    public static final Pattern FUNCTION_PATTERN = Pattern.compile("\\{\\{(.+)\\}\\}");

    ObjectRegistry objectRegistry = ObjectRegistry.getInstance();

    @Override
    public String resolveToken(IndexHolder indexHolder, CharSequence s) {
        objectRegistry.register(IndexHolder.class,indexHolder);

            try {
                FunctionParser functionParser = new FunctionParser(new ByteArrayInputStream(s.toString().getBytes()));
                return functionParser.Parse();
            } catch (ParseException e) {
                throw new IllegalArgumentException(e);
            }

    }


}