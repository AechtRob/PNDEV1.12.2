package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelPhialaspis extends AdvancedModelBase {
    private final AdvancedModelRenderer Body;
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
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer beak;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer Body5;

    public ModelPhialaspis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 24.0F, -2.0F);
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -2.5F, -2.25F, -3.0F, 5, 2, 6, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 8, -2.5F, -0.35F, -2.0F, 5, 1, 5, -0.01F, false));
        this.Body.cubeList.add(new ModelBox(Body, 16, 0, -2.0F, -3.25F, -1.0F, 4, 1, 4, 0.01F, false));
        this.Body.cubeList.add(new ModelBox(Body, 28, 12, -1.5F, -3.25F, 3.0F, 3, 1, 1, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 8, 20, -1.5F, -0.4F, 3.0F, 3, 1, 1, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 8, 28, -1.5F, -1.75F, -5.0F, 3, 1, 2, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 20, -3.5F, -1.75F, -3.0F, 1, 1, 6, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 32, -1.0F, -1.75F, -7.0F, 2, 1, 2, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 20, 2.5F, -1.75F, -3.0F, 1, 1, 6, 0.0F, true));
        this.Body.cubeList.add(new ModelBox(Body, 0, 4, -0.5F, -5.5F, 2.25F, 1, 1, 1, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -0.5F, -4.5F, 1.25F, 1, 2, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, -0.5F, -5.5F);
        this.Body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.0436F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 42, -0.275F, -0.65F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, -0.5F, -5.5F);
        this.Body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.1309F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 42, -0.125F, -0.65F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, -0.5F, -5.5F);
        this.Body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.2618F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 42, 0.0F, -0.65F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0F, -0.5F, -5.5F);
        this.Body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.3927F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 42, 0.1F, -0.65F, -0.65F, 0, 1, 1, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 42, 0.2F, -0.65F, -0.45F, 0, 1, 1, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, -0.5F, -5.5F);
        this.Body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0436F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 42, 0.275F, -0.65F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, -0.5F, -5.5F);
        this.Body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.1309F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 42, 0.125F, -0.65F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, -0.5F, -5.5F);
        this.Body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.3927F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 42, -0.2F, -0.65F, -0.45F, 0, 1, 1, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 42, -0.1F, -0.65F, -0.65F, 0, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0F, -0.5F, -5.5F);
        this.Body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.2618F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 42, 0.0F, -0.65F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1658F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 18, 5, -1.5F, -0.6F, -2.6F, 3, 1, 4, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -5.5F, 2.225F);
        this.Body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.829F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 8, -0.5F, 0.0F, 0.025F, 1, 4, 1, 0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(4.7F, 0.0F, -2.5F);
        this.Body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.2618F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 14, -4.0F, -1.0F, 0.0F, 4, 1, 5, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(3.1F, 0.0F, -3.6F);
        this.Body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 1.0036F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 13, 17, -3.05F, -1.025F, -3.025F, 3, 1, 5, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.0F, 0.25F, -6.0F);
        this.Body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.672F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 27, -1.9F, -2.0F, -0.1F, 2, 1, 4, -0.01F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-3.1F, 0.0F, -3.6F);
        this.Body.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -1.0036F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 13, 17, 0.05F, -1.025F, -3.025F, 3, 1, 5, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.0F, 0.25F, -6.0F);
        this.Body.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.672F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 27, -0.1F, -2.0F, -0.1F, 2, 1, 4, -0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-4.7F, 0.0F, -2.5F);
        this.Body.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.2618F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 14, 0.0F, -1.0F, 0.0F, 4, 1, 5, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -3.0F, -3.0F);
        this.Body.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.3927F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 24, 17, -1.5F, 0.6F, -2.0F, 3, 1, 4, 0.0F, false));

        this.beak = new AdvancedModelRenderer(this);
        this.beak.setRotationPoint(0.0F, -0.15F, -5.5F);
        this.Body.addChild(beak);
        this.setRotateAngle(beak, -0.7854F, 0.0F, 0.0F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -0.7F, 0.15F);
        this.beak.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, 0.7854F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 7, 37, -0.5F, -0.5F, -1.0F, 1, 1, 1, -0.01F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 37, -0.5F, -0.5F, -1.0F, 1, 1, 1, 0.0F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -1.5F, 3.0F);
        this.Body.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 16, 10, -2.0F, -1.25F, -0.75F, 4, 3, 4, 0.0F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 30, 22, -0.5F, -1.65F, 0.25F, 1, 1, 3, -0.01F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 15, 28, -0.5F, 1.0F, 0.25F, 1, 1, 3, -0.01F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.25F, 3.25F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 20, 24, -1.5F, -1.0F, -0.75F, 3, 2, 4, 0.01F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 20, 30, -0.5F, -1.6F, 0.0F, 1, 1, 3, -0.01F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 30, 0, -0.5F, 0.3F, 0.0F, 1, 1, 3, -0.01F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 3.25F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 28, 30, -1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 28, 6, -0.5F, -1.0F, -0.5F, 1, 2, 4, -0.01F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 14, 18, 0.0F, -2.5F, 2.0F, 0, 5, 5, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Body.render(f5);
    }

    public void renderStaticWall(float f) {
        this.Body.rotateAngleY = (float) Math.toRadians(90);
        //this.body.offsetX = -0.09F;
        this.Body.offsetY = -0.13F;
        this.Body.offsetX = -0.06F;
        this.Body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Body, 0.7418F, (float) Math.toRadians(90), 0.0F);

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
        this.Body.offsetY = 0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Body2, this.Body3, this.Body4, this.Body5};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.8F, 0.27F, 0, f2, 1);


            this.swing(Body, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                //this.Sclerodus.offsetY = 0.58F;
                this.bob(Body, -speed, 5F, false, f2, 1);
            }
        }
    }
}
