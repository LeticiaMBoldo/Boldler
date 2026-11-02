package br.com.github.leticiamboldo.boldler.service.base;

public interface IConvertsData {
    <T> T obtainData(String json, Class<T> classe);
}
