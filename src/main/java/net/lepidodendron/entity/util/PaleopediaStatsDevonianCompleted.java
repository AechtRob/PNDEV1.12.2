package net.lepidodendron.entity.util;

public class PaleopediaStatsDevonianCompleted implements IPaleopediaStatsDevonianCompleted {
    private float stats = 0;

    @Override
    public float getStats() {
        return stats;
    }

    @Override
    public void setStats(float value) {
        this.stats = value;
    }
}
