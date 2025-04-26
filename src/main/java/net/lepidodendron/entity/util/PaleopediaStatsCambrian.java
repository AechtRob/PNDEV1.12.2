package net.lepidodendron.entity.util;

public class PaleopediaStatsCambrian implements IPaleopediaStatsCambrian {
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
