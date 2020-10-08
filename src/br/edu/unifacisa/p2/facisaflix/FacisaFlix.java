package br.edu.unifacisa.p2.facisaflix;

import java.util.ArrayList;
import java.util.List;

public class FacisaFlix {
	private List<Serie> series;
	private List<Usuario> usuarios;

	public FacisaFlix() {
		series = new ArrayList<>();
		usuarios = new ArrayList<>();
	}

	public void adicionaSerie(Serie serie) {
		series.add(serie);
	}

	public void adicionaUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}

	public void registraVisualizacao(Usuario usuario, Episodio episodio, int nota) {
		Visualizacao v = new Visualizacao(episodio, nota);
		usuario.adicionaVisualizacao(v);
	}

	public List<Serie> getTodasAsSeries() {
		return series;
	}

	public List<Serie> getSeriesPorEstilo(int estilo) {
		List<Serie> seriesPorEstilo = new ArrayList<>();
		for (Serie serie : series) {
			if (serie.getEstilo() == estilo) {
				seriesPorEstilo.add(serie);
			}
		}
		return seriesPorEstilo;
	}

	public List<Serie> getSeriesPorClassificacao(int classificacao) {
		List<Serie> seriePorClassificacao = new ArrayList<>();
		for (Serie serie : series) {
			seriePorClassificacao.add(serie);
		}
		return seriePorClassificacao;
	}

	public List<Serie> getSeriesQueViu(Usuario usuario) {
		List<Serie> seriesQueViu = new ArrayList<>();
		for (Serie serie : series) {
			seriesQueViu.add(serie);
		}
		return seriesQueViu;
	}

	public List<Serie> getSeriesEmComum(Usuario u1, Usuario u2) {
		List<Serie> seriesEmComum = new ArrayList<>();
		for (Serie serie : series) {
			if (series.contains(serie)) {
				seriesEmComum.add(serie);
			}
		}
		return seriesEmComum;
	}

	public int getQuantidadeDeSeries() {
		int numSeries = 0;
		
		for (Serie serie : series) {
			numSeries += serie.getTemporadas().size();
		}
		return numSeries;
	}

	public int getQuantidadeTotalDeEpisodios() {
		int numEpisodios = 0;
		
		for (Serie s : series) {
			for(Temporada t : s.getTemporadas()) {
				numEpisodios += t.getEpisodios().size();
			}
		}
		return numEpisodios;
	}

	public int getQuantidadeTotalDeMinutos() {
		int numDeMinutos = 0;
		
		for (Serie serie : series) {
			for (Temporada t : serie.getTemporadas()) {
				for (Episodio e : t.getEpisodios()) {
					numDeMinutos += e.getDuracao();
				}
			}
		}
		return numDeMinutos;
	}
}
