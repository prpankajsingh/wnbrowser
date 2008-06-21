package edu.pku.ymd.wordnet;

interface NounSynset extends Synset
{
    WordPair[] getAntonyms();
    WordPair[] getAttributes();
    WordPair[] getHypernyms();
    WordPair[] getHyponyms();
    WordPair[] getInstanceHypernyms();
    WordPair[] getInstanceHyponyms();
    WordPair[] getMemberHolonyms();
    WordPair[] getMemberMeronyms();
    WordPair[] getPartHolonyms();
    WordPair[] getPartMeronyms();
    WordPair[] getRegionMembers();
    WordPair[] getRegions();
    WordPair[] getSubstanceHolonyms();
    WordPair[] getSubstanceMeronyms();
}