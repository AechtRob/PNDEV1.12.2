package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelOsteolepis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Osteolepis;
    private final AdvancedModelRenderer Cephalon;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer PectoralR;
    private final AdvancedModelRenderer PectoralL;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer VentralR;
    private final AdvancedModelRenderer VentralL;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer Bady5;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;

    public ModelOsteolepis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Osteolepis = new AdvancedModelRenderer(this);
        this.Osteolepis.setRotationPoint(0.0F, 21.0F, -5.0F);


        this.Cephalon = new AdvancedModelRenderer(this);
        this.Cephalon.setRotationPoint(0.0F, -0.7F, -3.3F);
        this.Osteolepis.addChild(Cephalon);
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 29, -0.5F, -1.3F, -4.6F, 1, 1, 5, -0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.4F, -3.5F);
        this.Cephalon.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1833F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 28, 32, -1.0F, -0.5578F, -0.5516F, 2, 1, 1, 0.04F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, -0.7F);
        this.Cephalon.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.192F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 20, 25, -1.0F, -0.9F, -1.0F, 2, 2, 2, 0.03F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.3F, -4.7F);
        this.Cephalon.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 10, 25, -1.0F, -1.0F, 0.0F, 2, 2, 5, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.0F, 0.2F);
        this.Cephalon.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.0873F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 25, 25, -1.0F, 0.0F, -4.9F, 2, 1, 5, -0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 1.7F, 0.0F);
        this.Jaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1222F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 26, 12, -0.5F, -1.1F, -4.9F, 1, 1, 5, 0.0F, false));

        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, -0.8F, -3.3F);
        this.Osteolepis.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 31, 0, -1.0F, -1.2F, 0.0F, 2, 4, 3, -0.002F, false));

        this.PectoralR = new AdvancedModelRenderer(this);
        this.PectoralR.setRotationPoint(-1.0F, 1.9F, 0.5F);
        this.Body1.addChild(PectoralR);
        this.setRotateAngle(PectoralR, -0.6398F, 0.9047F, -0.7211F);
        this.PectoralR.cubeList.add(new ModelBox(PectoralR, 4, 0, -0.8062F, -0.5167F, -0.0875F, 1, 1, 1, 0.0F, false));
        this.PectoralR.cubeList.add(new ModelBox(PectoralR, 22, 0, -3.9062F, -1.3167F, 0.0125F, 4, 2, 0, 0.0F, false));

        this.PectoralL = new AdvancedModelRenderer(this);
        this.PectoralL.setRotationPoint(1.0F, 1.9F, 0.5F);
        this.Body1.addChild(PectoralL);
        this.setRotateAngle(PectoralL, -0.6398F, -0.9047F, 0.7211F);
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 4, 0, -0.1938F, -0.5167F, -0.0875F, 1, 1, 1, 0.0F, true));
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 22, 0, -0.0938F, -1.3167F, 0.0125F, 4, 2, 0, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.55F, 3.05F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 15, 14, -1.0F, -1.75F, -0.45F, 2, 4, 6, -0.001F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.75F, 3.25F);
        this.Body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.48F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 0.0F, -3.4F, -1.0F, 0, 4, 3, 0.0F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, -0.25F, 5.25F);
        this.Body2.addChild(Body3);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.1F, 4.0F);
        this.Body3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.48F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 32, 32, 0.0F, -2.9F, -0.7F, 0, 3, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 2.2F, 0.0F);
        this.Body3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1047F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 20, -0.5F, -1.8F, 0.0F, 1, 2, 6, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0524F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 11, 0, -1.0F, -1.5F, 0.0F, 2, 3, 6, 0.0F, false));

        this.VentralR = new AdvancedModelRenderer(this);
        this.VentralR.setRotationPoint(-1.0F, 1.5F, 3.6F);
        this.Body3.addChild(VentralR);
        this.setRotateAngle(VentralR, -1.1177F, -0.272F, 0.5042F);
        this.VentralR.cubeList.add(new ModelBox(VentralR, 10, 33, 0.0F, -1.1F, 0.0F, 0, 2, 3, 0.0F, false));

        this.VentralL = new AdvancedModelRenderer(this);
        this.VentralL.setRotationPoint(1.0F, 1.5F, 3.6F);
        this.Body3.addChild(VentralL);
        this.setRotateAngle(VentralL, -1.1177F, 0.272F, -0.5042F);
        this.VentralL.cubeList.add(new ModelBox(VentralL, 10, 33, 0.0F, -1.1F, 0.0F, 0, 2, 3, 0.0F, true));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Body3.addChild(Body4);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 1.6F, 0.0F);
        this.Body4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.5236F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 35, 10, 0.0F, -0.8F, -0.4F, 0, 4, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 1.8F, 0.0F);
        this.Body4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2618F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 32, 19, -0.5F, -1.1F, -0.2F, 1, 1, 4, -0.001F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.2F, 0.0F);
        this.Body4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0175F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 21, 32, -0.5F, -0.0002F, -0.2209F, 1, 2, 4, 0.0F, false));

        this.Bady5 = new AdvancedModelRenderer(this);
        this.Bady5.setRotationPoint(0.0F, -0.8F, 3.6F);
        this.Body4.addChild(Bady5);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.7F, -0.5F);
        this.Bady5.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2269F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, 0.0F, -2.0F, 0.0F, 0, 9, 10, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, -0.3F, 0.2F);
        this.Bady5.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2443F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 22, 4, -1.0F, -0.1277F, -0.468F, 1, 1, 6, -0.002F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Osteolepis.render(f5);
    }

    public void renderStaticWall(float f) {
        this.Osteolepis.rotateAngleY = (float) Math.toRadians(90);
        this.Osteolepis.offsetX = -0.08F;
        this.Osteolepis.offsetY = -0.25F;
        this.Osteolepis.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Osteolepis, -0.7F, 0.0F, 0.0F);
        this.setRotateAngle(Body1, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(Body2, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(Body3, 0.1F, 0.1F, 0.0F);
        this.setRotateAngle(Body4, 0.05F, 0.1F, 0.0F);
        this.setRotateAngle(Bady5, 0.05F, 0.1F, 0.0F);
        this.Osteolepis.offsetZ = -0.0F;
        this.Osteolepis.offsetY = 0.0F;
        this.Osteolepis.render(0.01F);
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {

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
        //this.Osteolepis.offsetY = 1.1F;
        //this.Gills.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Gills.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Body2, this.Body3, this.Body4, this.Bady5};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.55F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.5F, -3, f2, 1);
            this.swing(Osteolepis, speed, 0.3F, true, 0, 0, f2, 1);
            this.walk(Jaw, (float) (speed * 0.5), (float)Math.toRadians(10), true, 0, 0, f2, 1);
            this.walk(PectoralL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(PectoralL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(PectoralR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(PectoralR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(VentralL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(VentralL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(VentralR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(VentralR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                this.Osteolepis.rotateAngleZ = (float) Math.toRadians(90);
                this.Osteolepis.offsetY = 0.15F;
                this.bob(Osteolepis, -speed, 5F, false, f2, 1);
            }
        }
    }
}
