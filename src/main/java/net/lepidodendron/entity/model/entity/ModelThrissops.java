package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelThrissops extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Thrissops;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer PectoralL;
    private final AdvancedModelRenderer PectoralR;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer VentralL;
    private final AdvancedModelRenderer VentralR;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer Body5;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;

    public ModelThrissops() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Thrissops = new AdvancedModelRenderer(this);
        this.Thrissops.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -7.0F, 2.0F);
        this.Thrissops.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 50, 73, -2.5F, -2.0F, -7.0F, 5, 5, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 61, 61, -3.5F, -3.9F, -3.0F, 7, 8, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 3.0F, -7.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2793F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 0, -2.0F, -1.0F, 6.3F, 4, 1, 1, -0.001F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 61, 31, -2.0F, -2.0F, 0.0F, 4, 2, 7, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -2.1F, -8.8F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1833F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 17, 51, -2.0F, 0.2422F, 2.7484F, 5, 1, 1, 0.04F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 17, 46, -2.0F, -0.2578F, 2.2484F, 5, 2, 2, 0.03F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, -2.0F, -6.9F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.4538F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 10, 3, -1.0F, -0.0528F, 0.0284F, 4, 1, 1, -0.001F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 63, 20, -1.0F, -0.0528F, 0.3284F, 4, 2, 7, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0F, -1.0F, -8.6F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.5585F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -2.8F, 1.2F, -0.3F, 0, 1, 1, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 5, 0, -2.8F, 0.1F, -0.6F, 0, 1, 1, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 0.8F, 1.2F, -0.3F, 0, 1, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 5, 0, 0.8F, 0.1F, -0.6F, 0, 1, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 30, 57, -3.0F, 0.0F, 0.0F, 4, 3, 2, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 2.2F, -6.9F);
        this.head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.2182F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -0.1F, 0.1F);
        this.Jaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.192F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 10, 6, -2.2F, -0.534F, -2.4267F, 0, 1, 1, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 13, 6, -2.2F, -0.834F, -3.5267F, 0, 1, 1, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 10, 6, 1.2F, -0.534F, -2.4267F, 0, 1, 1, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 13, 6, 1.2F, -0.834F, -3.5267F, 0, 1, 1, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 43, 0, -2.5F, -0.234F, -3.5267F, 4, 1, 4, 0.0F, false));

        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 22, 0, -3.0F, -5.0F, 0.0F, 6, 10, 8, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.Body1.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.192F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 43, 27, -2.0F, -1.3F, -0.1F, 4, 2, 8, 0.0F, false));

        this.PectoralL = new AdvancedModelRenderer(this);
        this.PectoralL.setRotationPoint(3.0F, 2.9F, -0.4F);
        this.Body1.addChild(PectoralL);
        this.setRotateAngle(PectoralL, -0.4274F, 0.4424F, -0.1926F);
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 67, 41, 0.0F, -1.5F, -0.3F, 0, 4, 8, 0.0F, false));

        this.PectoralR = new AdvancedModelRenderer(this);
        this.PectoralR.setRotationPoint(-3.0F, 2.9F, -0.4F);
        this.Body1.addChild(PectoralR);
        this.setRotateAngle(PectoralR, -0.4274F, -0.4424F, 0.1926F);
        this.PectoralR.cubeList.add(new ModelBox(PectoralR, 67, 41, 0.0F, -1.5F, -0.3F, 0, 4, 8, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 35, 38, -2.5F, -5.0F, -1.0F, 5, 10, 8, -0.001F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -6.8F, -0.6F);
        this.Body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0349F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 60, 0, -1.5F, 0.0F, -0.2F, 3, 3, 8, 0.0F, false));

        this.VentralL = new AdvancedModelRenderer(this);
        this.VentralL.setRotationPoint(2.5F, 4.2F, 5.4F);
        this.Body2.addChild(VentralL);
        this.setRotateAngle(VentralL, -0.6713F, 0.2068F, -0.1617F);
        this.VentralL.cubeList.add(new ModelBox(VentralL, 0, 0, 0.0034F, -0.9598F, -0.0125F, 0, 2, 4, 0.0F, false));

        this.VentralR = new AdvancedModelRenderer(this);
        this.VentralR.setRotationPoint(-2.5F, 4.2F, 5.4F);
        this.Body2.addChild(VentralR);
        this.setRotateAngle(VentralR, -0.6713F, -0.2068F, 0.1617F);
        this.VentralR.cubeList.add(new ModelBox(VentralR, 0, 0, -0.0034F, -0.9598F, -0.0125F, 0, 2, 4, 0.0F, true));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 46, -2.0F, -5.0F, -1.0F, 4, 9, 8, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.Body3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 31, 69, -1.0F, -2.0F, 0.0F, 2, 2, 7, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.Body3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0349F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 10, 72, -1.0F, 0.0F, 0.0F, 2, 2, 7, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 43, 9, -1.5F, -5.0F, -1.0F, 3, 7, 10, -0.011F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 4.4F, 0.0F);
        this.Body4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.192F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, 0.0F, 0.0F, -0.2F, 0, 9, 9, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 38, 57, -1.0F, -3.0F, -0.2F, 2, 3, 9, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -6.8F, 0.0F);
        this.Body4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1047F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 64, 0.0F, -5.9F, 2.0F, 0, 6, 8, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 53, 48, -1.0F, 0.1F, 0.0F, 2, 3, 9, 0.0F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 17, 56, -1.0F, -4.0F, -1.0F, 2, 5, 8, 0.0F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 0, 0, 0.0F, -14.0F, 5.9F, 0, 24, 21, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, 2.7F, -0.2F);
        this.Body5.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2443F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 69, 73, 0.5F, 0.0F, -0.3F, 0, 4, 7, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 76, 5, 0.0F, -2.0F, -0.3F, 1, 2, 7, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, -5.7F, 0.0F);
        this.Body5.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2443F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 77, 34, 0.0F, 0.0F, -0.2F, 1, 2, 7, 0.0F, false));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Thrissops.render(f5);
    }
    public void renderStaticWall(float f) {
        this.Thrissops.rotateAngleY = (float) Math.toRadians(90);
        this.Thrissops.offsetX = -0.23F;
        this.Thrissops.offsetY = -0.18F;
        this.Thrissops.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(cube_r1, -0.2793F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, -0.1833F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, 0.4538F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.5585F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -0.192F, 0.0F, 0.0F);
        this.setRotateAngle(Body1, 0.0401F, -0.05F, -0.0102F);
        this.setRotateAngle(cube_r6, 0.192F, 0.0F, 0.0F);
        this.setRotateAngle(PectoralL, -0.4274F, 0.4424F, -0.1926F);
        this.setRotateAngle(PectoralR, -0.4274F, -0.4424F, 0.1926F);
        this.setRotateAngle(Body2, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(cube_r7, 0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(VentralL, -0.6713F, 0.2068F, -0.1617F);
        this.setRotateAngle(VentralR, -0.6713F, -0.2068F, 0.1617F);
        this.setRotateAngle(Body3, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(cube_r8, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, -0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, 0.4363F, 0.0F);
        this.setRotateAngle(cube_r10, 0.192F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, -0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, 0.5236F, 0.0F);
        this.setRotateAngle(cube_r12, 0.2443F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, -0.2443F, 0.0F, 0.0F);
        this.Thrissops.rotateAngleY = (float) Math.toRadians(90);
        this.Thrissops.offsetY = -0.34F;
        this.Thrissops.offsetX = -0.1F;
        this.Thrissops.offsetZ = 0.F;
        this.Thrissops.render(0.01F);
        resetToDefaultPose();
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
        this.Thrissops.offsetY = 0F;
        this.Thrissops.offsetZ = -0.8F;
        //this.Gills.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Gills.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Body3, this.Body4, this.Body5};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed, 0.2F, -3, f2, 1);
            this.swing(Thrissops, speed, 0.2F, true, 0, 0, f2, 1);
            this.walk(Jaw, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(PectoralL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(PectoralL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(PectoralR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(PectoralR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(VentralL, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            this.swing(VentralL, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            this.walk(VentralR, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            this.swing(VentralR, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            if (!e.isInWater()) {
                this.Thrissops.rotateAngleZ = (float) Math.toRadians(90);
                this.Thrissops.offsetY = -0.2F;
                this.bob(Thrissops, -speed, 5F, false, f2, 1);
            }
        }
    }
}
