package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelMcnamaraspis extends AdvancedModelBase {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer Dorsalfin;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer Tail5;
    private final AdvancedModelRenderer Tail6;
    private final AdvancedModelRenderer Tailfin2;
    private final AdvancedModelRenderer Tailfin1;
    private final AdvancedModelRenderer Analfin;
    private final AdvancedModelRenderer Tailunderside1;
    private final AdvancedModelRenderer Leftpelvicfin;
    private final AdvancedModelRenderer Rightpelvicfin;
    private final AdvancedModelRenderer Head1;
    private final AdvancedModelRenderer Head1_r1;
    private final AdvancedModelRenderer Upperjaw1;
    private final AdvancedModelRenderer Upperjaw2_r1;
    private final AdvancedModelRenderer Upperjaw1_r1;
    private final AdvancedModelRenderer Upperjaw2;
    private final AdvancedModelRenderer Upperjawshears;
    private final AdvancedModelRenderer Leftcheek;
    private final AdvancedModelRenderer Rightcheek;
    private final AdvancedModelRenderer Throat;
    private final AdvancedModelRenderer Lowerjaw;
    private final AdvancedModelRenderer Lowerjawshears;
    private final AdvancedModelRenderer Rightpectoralfin;
    private final AdvancedModelRenderer Leftpectoralfin;

    public ModelMcnamaraspis() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 16.0F, 0.0F);


        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.root.addChild(Body1);
        this.setRotateAngle(Body1, 0.0848F, 0.0F, 0.0F);
        this.Body1.cubeList.add(new ModelBox(Body1, 0, 0, -4.5F, -2.0F, -4.0F, 9, 9, 7, 0.0F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -2.0F, 3.0F);
        this.Body1.addChild(Body2);
        this.setRotateAngle(Body2, -0.1061F, 0.0F, 0.0F);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 17, -4.0F, 0.0F, 0.0F, 8, 9, 6, 0.0F, false));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 2.3F, 5.3F);
        this.Body2.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.0637F, 0.0F, 0.0F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 40, 33, -3.5F, -2.0F, -0.5F, 7, 8, 5, 0.0F, false));

        this.Dorsalfin = new AdvancedModelRenderer(this);
        this.Dorsalfin.setRotationPoint(0.0F, -1.8F, 1.4F);
        this.Tail1.addChild(Dorsalfin);
        this.Dorsalfin.cubeList.add(new ModelBox(Dorsalfin, 19, 23, 0.0F, -11.0F, -1.0F, 0, 12, 10, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.2F, 4.0F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.0637F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 0, 39, -2.5F, -2.0F, -0.5F, 5, 6, 7, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.3F, 6.0F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.1061F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 0, 56, -2.0F, -2.0F, 0.0F, 4, 5, 6, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -0.7F, 5.0F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.2759F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 15, 62, -1.5F, -1.0F, 0.0F, 3, 4, 6, 0.0F, false));

        this.Tail5 = new AdvancedModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, 0.5F, 5.1F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, 0.3183F, 0.0F, 0.0F);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 64, 40, -1.0F, -1.0F, 0.0F, 2, 3, 7, 0.0F, false));

        this.Tail6 = new AdvancedModelRenderer(this);
        this.Tail6.setRotationPoint(-0.01F, -0.3F, 6.5F);
        this.Tail5.addChild(Tail6);
        this.setRotateAngle(Tail6, -0.1911F, 0.0F, 0.0F);
        this.Tail6.cubeList.add(new ModelBox(Tail6, 26, 65, -0.5F, -0.5F, 0.0F, 1, 2, 8, 0.0F, false));

        this.Tailfin2 = new AdvancedModelRenderer(this);
        this.Tailfin2.setRotationPoint(0.0F, -0.7F, 0.0F);
        this.Tail6.addChild(Tailfin2);
        this.Tailfin2.cubeList.add(new ModelBox(Tailfin2, 15, 46, 0.0F, 0.0F, 0.0F, 0, 5, 10, 0.0F, false));

        this.Tailfin1 = new AdvancedModelRenderer(this);
        this.Tailfin1.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Tail5.addChild(Tailfin1);
        this.Tailfin1.cubeList.add(new ModelBox(Tailfin1, 64, 61, 0.0F, 0.0F, 0.0F, 0, 7, 7, 0.0F, false));

        this.Analfin = new AdvancedModelRenderer(this);
        this.Analfin.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.Tail3.addChild(Analfin);
        this.Analfin.cubeList.add(new ModelBox(Analfin, 0, 68, 0.0F, 0.0F, 0.0F, 0, 5, 7, 0.0F, false));

        this.Tailunderside1 = new AdvancedModelRenderer(this);
        this.Tailunderside1.setRotationPoint(0.0F, 5.7F, -0.3F);
        this.Tail2.addChild(Tailunderside1);
        this.setRotateAngle(Tailunderside1, 0.2335F, 0.0F, 0.0F);
        this.Tailunderside1.cubeList.add(new ModelBox(Tailunderside1, 29, 55, -2.0F, -2.0F, 0.0F, 4, 2, 7, 0.0F, false));

        this.Leftpelvicfin = new AdvancedModelRenderer(this);
        this.Leftpelvicfin.setRotationPoint(-0.1F, -1.5F, 3.1F);
        this.Tailunderside1.addChild(Leftpelvicfin);
        this.setRotateAngle(Leftpelvicfin, 0.0276F, 0.8442F, 0.4833F);
        this.Leftpelvicfin.cubeList.add(new ModelBox(Leftpelvicfin, 26, 47, 0.0F, 0.0F, 0.0F, 5, 0, 7, 0.0F, false));

        this.Rightpelvicfin = new AdvancedModelRenderer(this);
        this.Rightpelvicfin.setRotationPoint(0.1F, -1.5F, 3.1F);
        this.Tailunderside1.addChild(Rightpelvicfin);
        this.setRotateAngle(Rightpelvicfin, 0.0276F, -0.8442F, -0.4833F);
        this.Rightpelvicfin.cubeList.add(new ModelBox(Rightpelvicfin, 26, 47, -5.0F, 0.0F, 0.0F, 5, 0, 7, 0.0F, true));

        this.Head1 = new AdvancedModelRenderer(this);
        this.Head1.setRotationPoint(0.0F, -2.0F, -3.9F);
        this.Body1.addChild(Head1);
        this.setRotateAngle(Head1, 0.2546F, 0.0F, 0.0F);


        this.Head1_r1 = new AdvancedModelRenderer(this);
        this.Head1_r1.setRotationPoint(0.0F, 0.1F, 0.2F);
        this.Head1.addChild(Head1_r1);
        this.setRotateAngle(Head1_r1, -0.1396F, 0.0F, 0.0F);
        this.Head1_r1.cubeList.add(new ModelBox(Head1_r1, 30, 11, -4.0F, 0.1522F, -5.5605F, 8, 7, 6, 0.0F, false));

        this.Upperjaw1 = new AdvancedModelRenderer(this);
        this.Upperjaw1.setRotationPoint(0.0F, 5.05F, -6.0F);
        this.Head1.addChild(Upperjaw1);
        this.setRotateAngle(Upperjaw1, -0.1061F, 0.0F, 0.0F);


        this.Upperjaw2_r1 = new AdvancedModelRenderer(this);
        this.Upperjaw2_r1.setRotationPoint(0.0F, -5.05F, -0.3F);
        this.Upperjaw1.addChild(Upperjaw2_r1);
        this.setRotateAngle(Upperjaw2_r1, 0.3316F, 0.0F, 0.0F);
        this.Upperjaw2_r1.cubeList.add(new ModelBox(Upperjaw2_r1, 0, 33, -3.0F, -1.0429F, -4.7311F, 6, 2, 3, -0.01F, false));

        this.Upperjaw1_r1 = new AdvancedModelRenderer(this);
        this.Upperjaw1_r1.setRotationPoint(0.0F, -5.05F, -0.3F);
        this.Upperjaw1.addChild(Upperjaw1_r1);
        this.setRotateAngle(Upperjaw1_r1, -0.0175F, 0.0F, 0.0F);
        this.Upperjaw1_r1.cubeList.add(new ModelBox(Upperjaw1_r1, 60, 30, -3.5F, -0.45F, -2.7F, 7, 4, 3, 0.0F, false));

        this.Upperjaw2 = new AdvancedModelRenderer(this);
        this.Upperjaw2.setRotationPoint(0.0F, -4.9F, -3.0F);
        this.Upperjaw1.addChild(Upperjaw2);
        this.setRotateAngle(Upperjaw2, 0.8702F, 0.0F, 0.0F);
        this.Upperjaw2.cubeList.add(new ModelBox(Upperjaw2, 52, 57, -3.0F, 0.3571F, -2.8198F, 6, 7, 3, 0.0F, false));

        this.Upperjawshears = new AdvancedModelRenderer(this);
        this.Upperjawshears.setRotationPoint(0.0F, 0.5F, -2.6F);
        this.Upperjaw2.addChild(Upperjawshears);
        this.setRotateAngle(Upperjawshears, 0.2759F, 0.0F, 0.0F);
        this.Upperjawshears.cubeList.add(new ModelBox(Upperjawshears, 71, 7, -2.5F, 0.3927F, -1.924F, 5, 5, 2, 0.0F, false));

        this.Leftcheek = new AdvancedModelRenderer(this);
        this.Leftcheek.setRotationPoint(1.4F, -2.1F, -2.0F);
        this.Upperjaw1.addChild(Leftcheek);
        this.setRotateAngle(Leftcheek, -0.7469F, 0.0943F, 0.0122F);
        this.Leftcheek.cubeList.add(new ModelBox(Leftcheek, 45, 68, -0.2F, -1.7F, -0.3F, 2, 3, 5, 0.0F, false));

        this.Rightcheek = new AdvancedModelRenderer(this);
        this.Rightcheek.setRotationPoint(-1.4F, -2.1F, -2.0F);
        this.Upperjaw1.addChild(Rightcheek);
        this.setRotateAngle(Rightcheek, -0.7469F, -0.0943F, -0.0122F);
        this.Rightcheek.cubeList.add(new ModelBox(Rightcheek, 45, 68, -1.8F, -1.7F, -0.3F, 2, 3, 5, 0.0F, true));

        this.Throat = new AdvancedModelRenderer(this);
        this.Throat.setRotationPoint(0.0F, 7.1F, -6.0F);
        this.Head1.addChild(Throat);
        this.setRotateAngle(Throat, -0.3821F, 0.0F, 0.0F);
        this.Throat.cubeList.add(new ModelBox(Throat, 56, 21, -3.5F, -1.8F, 0.0F, 7, 2, 4, 0.0F, false));

        this.Lowerjaw = new AdvancedModelRenderer(this);
        this.Lowerjaw.setRotationPoint(-0.01F, 6.2F, -5.6F);
        this.Head1.addChild(Lowerjaw);
        this.setRotateAngle(Lowerjaw, -0.6592F, 0.0F, 0.0F);
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 45, 49, -3.0F, 0.0F, -5.7F, 6, 1, 6, 0.0F, false));

        this.Lowerjawshears = new AdvancedModelRenderer(this);
        this.Lowerjawshears.setRotationPoint(0.0F, 0.0F, -5.7F);
        this.Lowerjaw.addChild(Lowerjawshears);
        this.setRotateAngle(Lowerjawshears, -0.0848F, 0.0F, 0.0F);
        this.Lowerjawshears.cubeList.add(new ModelBox(Lowerjawshears, 59, 0, -2.5F, -1.0F, 0.2F, 5, 1, 5, 0.0F, false));

        this.Rightpectoralfin = new AdvancedModelRenderer(this);
        this.Rightpectoralfin.setRotationPoint(-4.4F, 6.1F, -3.1F);
        this.Body1.addChild(Rightpectoralfin);
        this.setRotateAngle(Rightpectoralfin, 0.0041F, 0.0112F, -0.2452F);
        this.Rightpectoralfin.cubeList.add(new ModelBox(Rightpectoralfin, 33, 0, -8.6925F, 0.0702F, -0.949F, 9, 0, 7, 0.0F, false));

        this.Leftpectoralfin = new AdvancedModelRenderer(this);
        this.Leftpectoralfin.setRotationPoint(4.4F, 6.1F, -3.1F);
        this.Body1.addChild(Leftpectoralfin);
        this.setRotateAngle(Leftpectoralfin, 0.0041F, -0.0112F, 0.2452F);
        this.Leftpectoralfin.cubeList.add(new ModelBox(Leftpectoralfin, 30, 25, -0.3075F, 0.0702F, -0.949F, 9, 0, 7, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Body1.render(f5);
    }

    public void renderStaticWall(float f) {
        this.Body1.rotateAngleY = (float) Math.toRadians(90);
        this.Body1.offsetX = -0.06F;
        this.Body1.offsetY = -0.06F;
        this.Body1.offsetZ = 0.07F;
        this.Body1.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Body1, -0.1F, 0.0F, 0.05F);
        this.setRotateAngle(Body2, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(Tail1, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(Tail2, 0.05F, -0.1F, 0.0F);
        this.setRotateAngle(Tail3, 0.05F, 0.1F, 0.0F);
        this.setRotateAngle(Tail4, 0.05F, 0.2F, 0.0F);
        this.setRotateAngle(Tail5, 0.05F, 0.3F, 0.0F);
        this.setRotateAngle(Tail6, 0.05F, 0.3F, 0.0F);
        this.Body1.offsetZ = 0.0F;
        this.Body1.offsetY = 0.15F;
        this.Body1.offsetX = 0.008F;
        this.Body1.render(0.01F);
        this.resetToDefaultPose();
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
        //this.Body1.offsetY = 1.3F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Body2, this.Tail1, this.Tail2, this.Tail3, this.Tail4, this.Tail5, this.Tail6};
        float speed = 0.2F;
        if (!e.isInWater()) {
            speed = 0.5F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -0.2, f2, 0.4F);
            this.chainSwing(fishTail, speed * 1.5F, 0.25F, -1F, f2, 0.5F);
            this.swing(Body1, speed, 0.3F, true, 0, 0, f2, 1);
            this.walk(Lowerjaw, (float) (speed * 0.75), 0.32F, true, 0, -0.16F, f2, 1);
            this.walk(Leftpectoralfin, (float) (speed * 0.95), 0.4F, true, 0, 0, f2, 1);
            this.swing(Leftpectoralfin, (float) (speed * 0.95), 0.2F, true, 0, 0, f2, 1);
            this.walk(Rightpectoralfin, (float) (speed * 0.95), 0.4F, true, 0, 0, f2, 1);
            this.swing(Rightpectoralfin, (float) (speed * 0.95), 0.2F, true, 0, 0, f2, 1);
            this.walk(Leftpelvicfin, (float) (speed * 0.95), 0.12F, true, 0, 0, f2, 1);
            this.swing(Leftpelvicfin, (float) (speed * 0.95), 0.12F, true, 0, 0, f2, 1);
            this.walk(Rightpelvicfin, (float) (speed * 0.95), 0.12F, true, 0, 0, f2, 1);
            this.swing(Rightpelvicfin, (float) (speed * 0.95), 0.12F, true, 0, 0, f2, 1);

            if (!e.isInWater()) {
                this.Body1.rotateAngleZ = (float) Math.toRadians(90);
                this.Body1.offsetY = 0.15F;
                this.bob(Body1, -speed, 5F, false, f2, 1);
            }
        }
    }
}
