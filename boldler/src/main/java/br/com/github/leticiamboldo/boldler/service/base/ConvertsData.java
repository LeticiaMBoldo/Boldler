package br.com.github.leticiamboldo.boldler.service.base;


import tools.jackson.core.JacksonException;
import tools.jackson.databind.ObjectMapper;

public class ConvertsData implements IConvertsData {

    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T obtainData(String json, Class<T> classe) {
        try {
            return mapper.readValue(json, classe);
        } catch (JacksonException e) {
            throw new RuntimeException(e);
        }
    }
}
