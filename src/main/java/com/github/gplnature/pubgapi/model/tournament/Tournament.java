package com.github.gplnature.pubgapi.model.tournament;

import com.github.gplnature.pubgapi.holders.DataListHolder;
import com.github.gplnature.pubgapi.model.Links;
import com.github.gplnature.pubgapi.model.generic.Entity;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class Tournament extends Entity {

    @SerializedName("relationships")
    private TournamentRelationships tournamentRelationships;

    private DataListHolder<TournamentIncluded> included;
    private Links links;

    public Tournament() {
        super();
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public List<TournamentIncluded> getIncluded() {
        return included.getData();
    }

    public void setIncluded(DataListHolder<TournamentIncluded> included) {
        this.included = included;
    }

    public TournamentRelationships getTournamentRelationships() {
        return tournamentRelationships;
    }

    public void setTournamentRelationships(TournamentRelationships tournamentRelationships) {
        this.tournamentRelationships = tournamentRelationships;
    }
}
