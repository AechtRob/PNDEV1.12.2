package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.lepidodendron.entity.EntityPrehistoricFloraYunguisaurus;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelYunguisaurus extends AdvancedModelBase {


    public ModelYunguisaurus() {
        //Model here

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //this.Bodyfront.render(f5 * 0.15F);
    }

    public void renderStatic(float f) {
        //Static renderer for taxidermy
    }
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {

        float Finvertcialangle = 1;

        EntityPrehistoricFloraYunguisaurus ee = (EntityPrehistoricFloraYunguisaurus) e;
        int CycleA1 = 8;
        int CycleA2 = 2;
        int CycleA3 = 8;
        int CycleA4 = 2;

        int tickA = ee.getCycleTick();
        double revisedtickA = 0;

        if (tickA <= CycleA1) {
            revisedtickA = tickA;
        }
        else {
            if (tickA > (CycleA1 + CycleA2) && tickA <= (CycleA1 + CycleA2 + CycleA3)) {
                revisedtickA = (CycleA1 + CycleA2 + CycleA3) - tickA + 1;
            }
            else {
                if (tickA > (CycleA1 + CycleA2)) {
                    revisedtickA = 0;
                }
                else {
                    revisedtickA = CycleA1;
                }
            }
        }
        double percenttickA = revisedtickA / CycleA1;
        double radiansA = percenttickA * (Math.PI * 0.25 * 2);
        float angleA = (float)Math.sin(radiansA);

        System.err.println("angleA " + angleA);
        
        //stuff here
    }
}

























































