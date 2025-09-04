package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelDiplacanthus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer jaw;

    public ModelDiplacanthus() {
        this.textureWidth = 40;
        this.textureHeight = 40;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 20.95F, -2.0F);
        this.main.cubeList.add(new ModelBox(main, 28, 16, -1.5F, -0.95F, -4.95F, 3, 1, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 32, 20, -1.0F, -0.95F, -5.95F, 2, 1, 1, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.6F, -0.275F, -4.425F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.1745F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 33, 0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.6F, -0.275F, -4.425F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.1745F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 33, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, 1.5F, -2.625F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3491F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 8, -2.0F, -4.0F, 0.0F, 3, 2, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.45F, -2.475F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.48F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 18, 25, 0.0F, -7.725F, 1.0F, 0, 5, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.15F, -1.925F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 18, 0, -2.0F, -4.0F, 1.0F, 4, 1, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, -1.65F, -5.25F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.4232F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 22, 20, -2.0F, 0.0F, 0.0F, 3, 3, 2, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.95F, -5.95F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.7854F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 28, 18, -1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.075F, -4.2F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0742F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 14, -2.0F, -3.0F, 0.0F, 4, 3, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.6F, 1.05F, 1.9F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.5236F, 0.0F, -0.1745F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 32, 22, 0.0F, -1.0F, -0.65F, 0, 1, 2, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 1.3F, -1.45F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.3054F, 0.0F, -0.1745F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 28, 4, 0.0F, -1.0F, -0.5F, 0, 1, 4, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.6F, 1.05F, 1.9F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.5236F, 0.0F, 0.1745F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 32, 22, 0.0F, -1.0F, -0.65F, 0, 1, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, 1.3F, -1.45F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.3054F, 0.0F, 0.1745F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 28, 4, 0.0F, -1.0F, -0.5F, 0, 1, 4, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 1.3F, -1.25F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0436F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -2.0F, -4.0F, 0.0F, 5, 4, 4, 0.0F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-2.5F, 1.275F, -1.275F);
        this.main.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, 0.8727F, 0.0F, 0.8203F);
        this.frontrightfin.cubeList.add(new ModelBox(frontrightfin, 6, 26, 0.0F, 0.0F, 0.0F, 0, 5, 2, 0.0F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(2.5F, 1.275F, -1.275F);
        this.main.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, 0.8727F, 0.0F, -0.8203F);
        this.frontleftfin.cubeList.add(new ModelBox(frontleftfin, 6, 26, 0.0F, 0.0F, 0.0F, 0, 5, 2, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.7F, 2.55F);
        this.main.addChild(body2);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, 1.575F, -0.4F);
        this.body2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1745F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 14, 14, -2.0F, -3.0F, -1.25F, 3, 2, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.75F, 2.75F, 1.45F);
        this.body2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.7854F, 0.0F, -0.1745F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 24, 32, 0.0F, -2.0F, -0.45F, 0, 2, 2, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.75F, 2.75F, 1.45F);
        this.body2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.7854F, 0.0F, 0.1745F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 24, 32, 0.0F, -2.0F, -0.45F, 0, 2, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 2.675F, 0.5F);
        this.body2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1309F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 14, 8, -2.0F, -3.0F, -0.75F, 4, 3, 3, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.675F, 2.35F);
        this.body2.addChild(tail);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.55F, 0.85F);
        this.tail.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1745F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 20, -1.0F, -2.0F, -1.0F, 2, 2, 4, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 1.525F, 1.45F);
        this.tail.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1309F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 24, 25, -1.0F, -2.625F, -1.5F, 3, 1, 2, 0.01F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 18, 4, -1.0F, -2.0F, -1.5F, 3, 2, 2, 0.02F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 12, 20, -0.5F, -2.0F, 0.0F, 2, 2, 3, 0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 1.45F, 1.7F);
        this.tail.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.7854F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 30, 28, 0.0F, 0.025F, 0.0F, 0, 3, 2, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 1.5F, -1.675F);
        this.tail.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.5236F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 26, 0.0F, -7.725F, 1.0F, 0, 4, 3, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.1F, 4.3F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 24, 28, -0.5F, -1.0F, -0.45F, 1, 2, 2, 0.01F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.05F, 1.55F);
        this.tail2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.2094F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 32, 0, -0.5F, -1.0F, 0.0F, 1, 1, 2, -0.01F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 1.0F, 1.5F);
        this.tail2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.576F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 28, 9, -0.5F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -0.1F, -1.575F);
        this.tail2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -1.0908F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 12, 25, 0.0F, -7.725F, 1.025F, 0, 6, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.55F, -4.05F);
        this.main.addChild(jaw);
        this.setRotateAngle(jaw, -0.2618F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 28, 13, -1.0F, -0.5F, -1.75F, 2, 1, 2, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.4F;
        this.main.offsetX = 0.2F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 2.8F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);
        this.tail2.rotateAngleY = (float) Math.toRadians(-32.5);
        this.tail.rotateAngleY = (float) Math.toRadians(12.5);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetY = -0.21F;
        this.main.offsetX = -0.03F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.tail2.rotateAngleY = (float) Math.toRadians(-32.5);
        this.tail.rotateAngleY = (float) Math.toRadians(12.5);
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetY = -0.4F;
        this.main.offsetZ = 0.03F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.Gills.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Gills.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.7F;

        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.3F, -3, f2, 1);
            this.swing(main, speed, 0.15F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.flap(frontleftfin, (float) (speed * 0.75), 0.18F, true, 0, 0, f2, 1);
            this.swing(frontleftfin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.flap(frontrightfin, (float) (speed * 0.75), 0.18F, true, -3, 0, f2, 1);
            this.swing(frontrightfin, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);
            if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = 0.2F;
                this.bob(main, speed, 0.1F, false, f2, 1);

            }
        }
    }
}
