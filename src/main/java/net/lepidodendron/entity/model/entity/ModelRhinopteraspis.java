package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelRhinopteraspis extends AdvancedModelBase {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer wing;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer wing2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer nose;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer horn;
    private final AdvancedModelRenderer cube_r15;

    public ModelRhinopteraspis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -3.2F, 1.75F);
        this.root.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 44, 24, -2.0F, -2.5F, 0.5F, 4, 5, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.25F, 5.5F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 28, 39, -1.5F, -2.0F, -1.0F, 3, 4, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.25F, 5.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 0, -1.0F, -1.5F, -1.0F, 2, 3, 5, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.134F, 3.6827F);
        this.tail3.addChild(tail4);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.0F, -0.216F, 4.5173F);
        this.tail4.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0567F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 17, 16, 1.5F, 0.225F, -2.0F, 1, 2, 4, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.0F, -0.216F, 4.5173F);
        this.tail4.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 39, 42, 1.5F, -1.625F, -5.0F, 1, 2, 7, 0.001F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.8829F, 4.4647F);
        this.tail4.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 32, -0.5F, -1.0F, -5.0F, 1, 2, 10, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-2.0F, -1.7F, -1.75F);
        this.root.addChild(head);
        this.setRotateAngle(head, 0.0873F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 24, 29, -0.5F, -0.5F, -4.0F, 5, 2, 8, 0.003F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, -0.5F, -3.556F, -9.6396F, 5, 2, 14, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 17, 16, -0.5F, -1.556F, -6.6396F, 5, 2, 11, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 13, 45, 0.0F, -4.731F, -11.9896F, 4, 2, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 45, 0.0F, -4.731F, -10.3396F, 4, 2, 5, 0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -5.4219F, 1.6349F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 8, 0.0F, 0.975F, 0.0F, 4, 2, 3, 0.003F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -5.356F, -5.3396F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 38, 12, 0.0F, 0.6091F, -0.0255F, 4, 2, 7, 0.002F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -3.1703F, -6.4804F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0438F, -0.0872F, 0.0038F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 24, 0, -0.45F, -0.5F, -5.5F, 2, 1, 11, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(4.5F, -3.1703F, -6.4804F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0438F, 0.0872F, -0.0038F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 24, 0, -1.55F, -0.5F, -5.5F, 2, 1, 11, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.55F, -9.65F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.7418F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 25, 0.0F, -2.006F, -3.9896F, 4, 2, 2, -0.001F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 16, -0.5F, -2.006F, -1.9896F, 5, 2, 2, 0.001F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 1.5F, -4.0F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3491F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 39, 0, -0.5F, -2.0F, -6.0F, 5, 2, 6, 0.002F, false));

        this.wing = new AdvancedModelRenderer(this);
        this.wing.setRotationPoint(-1.5F, -3.8327F, -1.4457F);
        this.head.addChild(wing);
        this.wing.cubeList.add(new ModelBox(wing, 38, 21, 3.875F, 0.4F, 1.2F, 6, 1, 2, 0.001F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(5.0F, 0.0F, 0.0F);
        this.wing.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.4363F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 39, 8, -1.125F, 0.4F, -0.95F, 6, 1, 2, 0.0F, false));

        this.wing2 = new AdvancedModelRenderer(this);
        this.wing2.setRotationPoint(5.5F, -3.8327F, -1.4457F);
        this.head.addChild(wing2);
        this.wing2.cubeList.add(new ModelBox(wing2, 38, 21, -9.875F, 0.4F, 1.2F, 6, 1, 2, 0.001F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-5.0F, 0.0F, 0.0F);
        this.wing2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.4363F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 39, 8, -4.875F, 0.4F, -0.95F, 6, 1, 2, 0.0F, true));

        this.nose = new AdvancedModelRenderer(this);
        this.nose.setRotationPoint(3.0F, -0.55F, -9.65F);
        this.head.addChild(nose);
        this.nose.cubeList.add(new ModelBox(nose, 24, 0, -2.0F, -4.0F, -5.0F, 2, 1, 3, 0.0F, false));
        this.nose.cubeList.add(new ModelBox(nose, 12, 34, -1.5F, -4.0F, -15.0F, 1, 1, 10, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -3.5F, -3.5F);
        this.nose.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0873F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 17, 22, -1.5F, -0.275F, -1.5F, 2, 1, 3, -0.001F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-2.5F, -3.5F, -3.0F);
        this.nose.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0016F, -0.3052F, 0.0118F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 24, 4, 0.025F, -0.5F, -2.05F, 1, 1, 3, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, -3.5F, -3.0F);
        this.nose.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0016F, 0.3052F, -0.0118F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 24, 4, -1.025F, -0.5F, -2.05F, 1, 1, 3, 0.0F, false));

        this.horn = new AdvancedModelRenderer(this);
        this.horn.setRotationPoint(3.0F, -4.4219F, 0.6349F);
        this.head.addChild(horn);
        this.setRotateAngle(horn, 0.2182F, 0.0F, 0.0F);
        this.horn.cubeList.add(new ModelBox(horn, 0, 20, -2.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.0F, 0.0F, 4.0F);
        this.horn.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0916F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 16, -0.5F, 0.0F, 0.0F, 1, 1, 15, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.root.render(f5);
    }
    public void renderStaticWall(float f) {
        this.root.rotateAngleY = (float) Math.toRadians(90);
        this.root.offsetX = -0.05F;
        this.root.offsetY = -0.23F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.root.rotateAngleY = (float) Math.toRadians(90);
        this.root.offsetY = -0.6F;
        this.root.offsetX = -0.04F;
        this.root.offsetZ = 0.0F;
        this.root.render(0.01F);
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
        this.root.offsetY = 0F;
        //this.Gills.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Gills.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed, 0.2F, -3, f2, 1);
            this.swing(root, speed, 0.3F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                this.root.rotateAngleZ = (float) Math.toRadians(90);
                this.root.offsetY = -0.30F;
                this.bob(root, -speed, 5F, false, f2, 1);
            }
        }
    }
}
