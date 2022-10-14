package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelCoccosteus extends AdvancedModelBase {
    public AdvancedModelRenderer Body1;
    public AdvancedModelRenderer Body2;
    public AdvancedModelRenderer Head1;
    public AdvancedModelRenderer Leftpectoralfin;
    public AdvancedModelRenderer Rightpectoralfin;
    public AdvancedModelRenderer Tail1;
    public AdvancedModelRenderer Tail2;
    public AdvancedModelRenderer Tail3;
    public AdvancedModelRenderer Tailunderside1;
    public AdvancedModelRenderer Dorsalfin;
    public AdvancedModelRenderer Tail4;
    public AdvancedModelRenderer Analfin;
    public AdvancedModelRenderer Tail5;
    public AdvancedModelRenderer Tail6;
    public AdvancedModelRenderer Tailfin1;
    public AdvancedModelRenderer Tailfin2;
    public AdvancedModelRenderer Leftpelvicfin;
    public AdvancedModelRenderer Rightpelvicfin;
    public AdvancedModelRenderer Upperjaw1;
    public AdvancedModelRenderer Throat;
    public AdvancedModelRenderer Lowerjaw;
    public AdvancedModelRenderer Upperjaw2;
    public AdvancedModelRenderer Leftcheek;
    public AdvancedModelRenderer Rightcheek;
    public AdvancedModelRenderer Upperjawshears;
    public AdvancedModelRenderer Lowerjawshears;

    public ModelCoccosteus() {
        this.textureWidth = 100;
        this.textureHeight = 100;
        this.Leftpectoralfin = new AdvancedModelRenderer(this, 30, 0);
        this.Leftpectoralfin.setRotationPoint(4.5F, 6.300000190734863F, -3.5F);
        this.Leftpectoralfin.addBox(0.0F, 0.0F, 0.0F, 11, 0, 7, 0.0F);
        this.setRotateAngle(Leftpectoralfin, 0.0F, -0.36093409463874954F, 0.5942845969882637F);
        this.Rightpectoralfin = new AdvancedModelRenderer(this, 53, 0);
        this.Rightpectoralfin.setRotationPoint(-4.5F, 6.300000190734863F, -3.5F);
        this.Rightpectoralfin.addBox(-11.0F, 0.0F, 0.0F, 11, 0, 7, 0.0F);
        this.setRotateAngle(Rightpectoralfin, 0.0F, 0.36093409463874954F, -0.5942845969882637F);
        this.Analfin = new AdvancedModelRenderer(this, 34, 2);
        this.Analfin.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.Analfin.addBox(0.0F, 0.0F, 0.0F, 0, 5, 7, 0.0F);
        this.Tail4 = new AdvancedModelRenderer(this, 24, 33);
        this.Tail4.setRotationPoint(0.0F, -0.699999988079071F, 5.0F);
        this.Tail4.addBox(-1.5F, -1.0F, 0.0F, 3, 4, 6, 0.0F);
        this.setRotateAngle(Tail4, 0.27593656206399647F, 0.0F, 0.0F);
        this.Tailfin1 = new AdvancedModelRenderer(this, 34, 9);
        this.Tailfin1.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Tailfin1.addBox(0.0F, 0.0F, 0.0F, 0, 7, 7, 0.0F);
        this.Body1 = new AdvancedModelRenderer(this, 0, 84);
        this.Body1.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.Body1.addBox(-4.5F, -2.0F, -4.0F, 9, 9, 7, 0.0F);
        this.setRotateAngle(Body1, 0.08482300164692443F, 0.0F, 0.0F);
        this.Throat = new AdvancedModelRenderer(this, 29, 74);
        this.Throat.setRotationPoint(0.0F, 7.099999904632568F, -6.0F);
        this.Throat.addBox(-3.5F, -2.0F, 0.0F, 7, 2, 4, 0.0F);
        this.setRotateAngle(Throat, -0.38205256260891435F, 0.0F, 0.0F);
        this.Tail3 = new AdvancedModelRenderer(this, 0, 14);
        this.Tail3.setRotationPoint(0.0F, 0.30000001192092896F, 6.0F);
        this.Tail3.addBox(-2.0F, -2.0F, 0.0F, 4, 5, 6, 0.0F);
        this.setRotateAngle(Tail3, 0.10611601718967469F, 0.0F, 0.0F);
        this.Upperjaw2 = new AdvancedModelRenderer(this, 33, 90);
        this.Upperjaw2.setRotationPoint(0.0F, -4.900000095367432F, -3.0F);
        this.Upperjaw2.addBox(-3.0F, 0.0F, -3.0F, 6, 7, 3, 0.0F);
        this.setRotateAngle(Upperjaw2, 0.8702211756970171F, 0.0F, 0.0F);
        this.Lowerjawshears = new AdvancedModelRenderer(this, 1, 0);
        this.Lowerjawshears.setRotationPoint(0.0F, 0.0F, -5.699999809265137F);
        this.Lowerjawshears.addBox(-2.5F, -1.0F, 0.0F, 5, 1, 5, 0.0F);
        this.setRotateAngle(Lowerjawshears, -0.08482300397719036F, 0.0F, 0.0F);
        this.Tail5 = new AdvancedModelRenderer(this, 25, 44);
        this.Tail5.setRotationPoint(0.0F, 0.5F, 5.099999904632568F);
        this.Tail5.addBox(-1.0F, -1.0F, 0.0F, 2, 3, 7, 0.0F);
        this.setRotateAngle(Tail5, 0.31834805156902407F, 0.0F, 0.0F);
        this.Tailunderside1 = new AdvancedModelRenderer(this, 18, 23);
        this.Tailunderside1.setRotationPoint(0.0F, 5.699999809265137F, -0.30000001192092896F);
        this.Tailunderside1.addBox(-2.0F, -2.0F, 0.0F, 4, 2, 7, 0.0F);
        this.setRotateAngle(Tailunderside1, 0.23352505591421208F, 0.0F, 0.0F);
        this.Leftpelvicfin = new AdvancedModelRenderer(this, 35, 32);
        this.Leftpelvicfin.setRotationPoint(0.5F, -0.5F, 1.0F);
        this.Leftpelvicfin.addBox(0.0F, 0.0F, 0.0F, 5, 0, 7, 0.0F);
        this.setRotateAngle(Leftpelvicfin, -0.10611601718967469F, 0.23352505591421208F, 0.46705011182842415F);
        this.Tail6 = new AdvancedModelRenderer(this, 29, 55);
        this.Tail6.setRotationPoint(0.009999999776482582F, -0.30000001192092896F, 6.5F);
        this.Tail6.addBox(-0.5F, -0.5F, 0.0F, 1, 2, 8, 0.0F);
        this.setRotateAngle(Tail6, -0.1911135497644277F, 0.0F, 0.0F);
        this.Upperjawshears = new AdvancedModelRenderer(this, 22, 0);
        this.Upperjawshears.setRotationPoint(0.0F, 0.5F, -2.5999999046325684F);
        this.Upperjawshears.addBox(-2.5F, 0.0F, -2.0F, 5, 5, 2, 0.0F);
        this.setRotateAngle(Upperjawshears, 0.27593656206399647F, 0.0F, 0.0F);
        this.Dorsalfin = new AdvancedModelRenderer(this, 15, 0);
        this.Dorsalfin.setRotationPoint(0.0F, -2.0F, 1.0F);
        this.Dorsalfin.addBox(0.0F, -7.0F, 0.0F, 0, 7, 9, 0.0F);
        this.Rightpelvicfin = new AdvancedModelRenderer(this, 34, 24);
        this.Rightpelvicfin.setRotationPoint(-0.5F, -0.5F, 1.0F);
        this.Rightpelvicfin.addBox(-5.0F, 0.0F, 0.0F, 5, 0, 7, 0.0F);
        this.setRotateAngle(Rightpelvicfin, -0.10611601718967469F, -0.23352505591421208F, -0.46705011182842415F);
        this.Lowerjaw = new AdvancedModelRenderer(this, 23, 66);
        this.Lowerjaw.setRotationPoint(0.009999999776482582F, 6.199999809265137F, -5.599999904632568F);
        this.Lowerjaw.addBox(-3.0F, 0.0F, -6.0F, 6, 1, 6, 0.0F);
        //this.setRotateAngle(Lowerjaw, -0.6155776351678833F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjaw, -0.1F, 0.0F, 0.0F);
        this.Leftcheek = new AdvancedModelRenderer(this, 26, 81);
        this.Leftcheek.setRotationPoint(1.399999976158142F, -2.0999999046325684F, -2.0F);
        this.Leftcheek.addBox(0.0F, -1.5F, 0.0F, 2, 3, 5, 0.0F);
        this.setRotateAngle(Leftcheek, -0.7429866572476639F, -0.021293017373673524F, -0.10611601718967469F);
        this.Rightcheek = new AdvancedModelRenderer(this, 41, 81);
        this.Rightcheek.setRotationPoint(-1.399999976158142F, -2.0999999046325684F, -2.0F);
        this.Rightcheek.addBox(-2.0F, -1.5F, 0.0F, 2, 3, 5, 0.0F);
        this.setRotateAngle(Rightcheek, -0.7429866572476639F, 0.021293017373673524F, 0.11868239246456576F);
        this.Head1 = new AdvancedModelRenderer(this, 0, 54);
        this.Head1.setRotationPoint(0.0F, -2.0F, -3.9000000953674316F);
        this.Head1.addBox(-4.0F, 0.0F, -6.0F, 8, 7, 6, 0.0F);
        this.setRotateAngle(Head1, 0.2546435405291338F, 0.0F, 0.0F);
        this.Tail1 = new AdvancedModelRenderer(this, 0, 40);
        this.Tail1.setRotationPoint(0.0F, 2.299999952316284F, 5.300000190734863F);
        this.Tail1.addBox(-3.5F, -2.0F, -0.5F, 7, 8, 5, 0.0F);
        this.setRotateAngle(Tail1, -0.06370451936226872F, 0.0F, 0.0F);
        this.Body2 = new AdvancedModelRenderer(this, 0, 68);
        this.Body2.setRotationPoint(0.0F, -2.0F, 3.0F);
        this.Body2.addBox(-4.0F, 0.0F, 0.0F, 8, 9, 6, 0.0F);
        this.setRotateAngle(Body2, -0.10611601718967469F, 0.0F, 0.0F);
        this.Tail2 = new AdvancedModelRenderer(this, 0, 26);
        this.Tail2.setRotationPoint(0.0F, 0.20000000298023224F, 4.0F);
        this.Tail2.addBox(-2.5F, -2.0F, -0.5F, 5, 6, 7, 0.0F);
        this.setRotateAngle(Tail2, -0.06370451936226872F, 0.0F, 0.0F);
        this.Tailfin2 = new AdvancedModelRenderer(this, 49, 3);
        this.Tailfin2.setRotationPoint(0.0F, -0.699999988079071F, 0.0F);
        this.Tailfin2.addBox(0.0F, 0.0F, 0.0F, 0, 5, 10, 0.0F);
        this.Upperjaw1 = new AdvancedModelRenderer(this, 52, 93);
        this.Upperjaw1.setRotationPoint(0.0F, 5.050000190734863F, -6.0F);
        this.Upperjaw1.addBox(-3.5F, -5.0F, -3.0F, 7, 4, 3, 0.0F);
        this.setRotateAngle(Upperjaw1, -0.10611601718967469F, 0.0F, 0.0F);
        this.Body1.addChild(this.Leftpectoralfin);
        this.Body1.addChild(this.Rightpectoralfin);
        this.Tail3.addChild(this.Analfin);
        this.Tail3.addChild(this.Tail4);
        this.Tail5.addChild(this.Tailfin1);
        this.Head1.addChild(this.Throat);
        this.Tail2.addChild(this.Tail3);
        this.Upperjaw1.addChild(this.Upperjaw2);
        this.Lowerjaw.addChild(this.Lowerjawshears);
        this.Tail4.addChild(this.Tail5);
        this.Tail2.addChild(this.Tailunderside1);
        this.Tailunderside1.addChild(this.Leftpelvicfin);
        this.Tail5.addChild(this.Tail6);
        this.Upperjaw2.addChild(this.Upperjawshears);
        this.Tail2.addChild(this.Dorsalfin);
        this.Tailunderside1.addChild(this.Rightpelvicfin);
        this.Head1.addChild(this.Lowerjaw);
        this.Upperjaw1.addChild(this.Leftcheek);
        this.Upperjaw1.addChild(this.Rightcheek);
        this.Body1.addChild(this.Head1);
        this.Body2.addChild(this.Tail1);
        this.Body1.addChild(this.Body2);
        this.Tail1.addChild(this.Tail2);
        this.Tail6.addChild(this.Tailfin2);
        this.Head1.addChild(this.Upperjaw1);

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Body1.render(f5 * 0.135F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.Body1.rotateAngleY = (float) Math.toRadians(90);
        this.Body1.render(0.01F);
        GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.Body1.offsetY = 1.3F;
        //has a neck joint for looking up and down
        //this.Head1.rotateAngleY = f3 / (180F / (float) Math.PI);
        this.Head1.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Body2, this.Tail1, this.Tail2, this.Tail3, this.Tail4};
        float speed = 0.2F;
        if (!e.isInWater()) {
            speed = 0.5F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -0.2, f2, 0.4F);
            this.chainSwing(fishTail, speed * 1.5F, 0.25F, -0.5, f2, 0.5F);
            this.swing(Body1, speed, 0.2F, true, 0, 0, f2, 1);
            this.walk(Lowerjaw, (float) (speed * 0.75), 0.32F, true, 0, 0, f2, 1);
            this.walk(Leftpectoralfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(Leftpectoralfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(Rightpectoralfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(Rightpectoralfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(Leftpelvicfin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.swing(Leftpelvicfin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.walk(Rightpelvicfin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.swing(Rightpelvicfin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);

            if (!e.isInWater()) {
                this.Body1.rotateAngleZ = (float) Math.toRadians(90);
                this.Body1.offsetY = 1.45F;
                this.bob(Body1, -speed, 5F, false, f2, 1);
            }
        }
    }
}
