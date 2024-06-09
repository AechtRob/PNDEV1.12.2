package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelRolfosteus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Root;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer RPectoral;
    private final AdvancedModelRenderer LPectoral;
    private final AdvancedModelRenderer RGill;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer LGill;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer lips;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer rostrum;
    private final AdvancedModelRenderer rostrum2;
    private final AdvancedModelRenderer forehead;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer RPelvic;
    private final AdvancedModelRenderer LPelvic;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;

    public ModelRolfosteus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Root = new AdvancedModelRenderer(this);
        this.Root.setRotationPoint(0.0F, 21.0F, 1.0F);


        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.0F, -8.25F);
        this.Root.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 10, 27, -1.0F, -1.5F, -2.5F, 2, 3, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 1.75F, -2.5F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 23, -1.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.RPectoral = new AdvancedModelRenderer(this);
        this.RPectoral.setRotationPoint(-1.0F, 1.5F, -0.5F);
        this.Head.addChild(RPectoral);
        this.setRotateAngle(RPectoral, 0.0F, 0.3927F, -0.6545F);
        this.RPectoral.cubeList.add(new ModelBox(RPectoral, 0, 0, -8.0F, 0.0F, 0.0F, 8, 0, 4, 0.0F, false));

        this.LPectoral = new AdvancedModelRenderer(this);
        this.LPectoral.setRotationPoint(1.0F, 1.5F, -0.5F);
        this.Head.addChild(LPectoral);
        this.setRotateAngle(LPectoral, 0.0F, -0.3927F, 0.6545F);
        this.LPectoral.cubeList.add(new ModelBox(LPectoral, 0, 0, 0.0F, 0.0F, 0.0F, 8, 0, 4, 0.0F, true));

        this.RGill = new AdvancedModelRenderer(this);
        this.RGill.setRotationPoint(-1.0F, 0.0F, -2.5F);
        this.Head.addChild(RGill);
        this.setRotateAngle(RGill, 0.0F, -0.1431F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RGill.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.0436F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 17, 1, -0.01F, -1.5F, 0.0F, 1, 3, 3, -0.01F, false));

        this.LGill = new AdvancedModelRenderer(this);
        this.LGill.setRotationPoint(1.0F, 0.0F, -2.5F);
        this.Head.addChild(LGill);
        this.setRotateAngle(LGill, 0.0F, 0.1431F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LGill.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0436F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 17, 1, -0.99F, -1.5F, 0.0F, 1, 3, 3, -0.01F, true));

        this.lips = new AdvancedModelRenderer(this);
        this.lips.setRotationPoint(0.0F, 1.0F, -2.25F);
        this.Head.addChild(lips);
        this.setRotateAngle(lips, -0.0873F, 0.0F, 0.0F);
        this.lips.cubeList.add(new ModelBox(lips, 18, 10, -1.0F, -2.0F, -4.0F, 2, 2, 4, 0.0F, false));
        this.lips.cubeList.add(new ModelBox(lips, 24, 20, -1.0F, -1.5F, -3.25F, 2, 1, 1, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.lips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -1.0488F, 0.0436F, -0.0756F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 3, 0.25F, -1.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.lips.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -1.0488F, -0.0436F, 0.0756F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 3, -0.25F, -1.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.lips.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.087F, -0.0511F, 0.0831F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -0.25F, -0.65F, 1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.lips.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.087F, 0.0511F, -0.0831F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 6, 5, 0.25F, -0.65F, 1.0F, 0, 1, 2, 0.0F, false));

        this.rostrum = new AdvancedModelRenderer(this);
        this.rostrum.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.lips.addChild(rostrum);
        this.rostrum.cubeList.add(new ModelBox(rostrum, 0, 30, -0.5F, -1.01F, -4.0F, 1, 1, 4, 0.01F, false));

        this.rostrum2 = new AdvancedModelRenderer(this);
        this.rostrum2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.rostrum.addChild(rostrum2);
        this.setRotateAngle(rostrum2, 0.2618F, 0.0F, 0.0F);
        this.rostrum2.cubeList.add(new ModelBox(rostrum2, 13, 4, -0.5F, -1.0F, 3.25F, 1, 1, 1, -0.01F, false));
        this.rostrum2.cubeList.add(new ModelBox(rostrum2, 0, 0, -0.5F, -0.75F, 3.25F, 1, 1, 1, -0.01F, false));
        this.rostrum2.cubeList.add(new ModelBox(rostrum2, 7, 4, -0.5F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.forehead = new AdvancedModelRenderer(this);
        this.forehead.setRotationPoint(0.0F, -1.0F, 4.25F);
        this.rostrum2.addChild(forehead);
        this.setRotateAngle(forehead, -0.0436F, 0.0F, 0.0F);
        this.forehead.cubeList.add(new ModelBox(forehead, 29, 0, -1.0F, -0.02F, -0.05F, 2, 1, 4, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 3.95F);
        this.forehead.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1134F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 22, 29, -1.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 0.0F, -0.2F);
        this.lips.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.0436F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 29, 31, -0.5F, -0.25F, -2.8F, 1, 1, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, -2.75F);
        this.Jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.087F, -0.0511F, -0.0831F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 1, -0.25F, -0.65F, 0.25F, 0, 1, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, -2.75F);
        this.Jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.087F, 0.0511F, 0.0831F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 1, 0.25F, -0.65F, 0.25F, 0, 1, 2, 0.0F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.Root.addChild(Body);
        this.Body.cubeList.add(new ModelBox(Body, 24, 10, -1.5F, -2.0F, 0.0F, 3, 4, 6, 0.01F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Body.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 11, 16, -1.5F, -2.0F, 0.0F, 3, 4, 7, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.Body2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1745F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 20, 0.0F, -3.0F, 0.0F, 0, 3, 7, 0.0F, false));

        this.RPelvic = new AdvancedModelRenderer(this);
        this.RPelvic.setRotationPoint(-1.5F, 2.0F, 3.0F);
        this.Body2.addChild(RPelvic);
        this.setRotateAngle(RPelvic, 0.0F, 0.6545F, -0.6545F);
        this.RPelvic.cubeList.add(new ModelBox(RPelvic, 0, 4, -4.0F, 0.0F, 0.0F, 4, 0, 3, 0.0F, false));

        this.LPelvic = new AdvancedModelRenderer(this);
        this.LPelvic.setRotationPoint(1.5F, 2.0F, 3.0F);
        this.Body2.addChild(LPelvic);
        this.setRotateAngle(LPelvic, 0.0F, -0.6545F, 0.6545F);
        this.LPelvic.cubeList.add(new ModelBox(LPelvic, 0, 4, 0.0F, 0.0F, 0.0F, 4, 0, 3, 0.0F, true));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Body2.addChild(Tail);
        this.Tail.cubeList.add(new ModelBox(Tail, 18, 0, -1.0F, -1.5F, 0.0F, 2, 3, 7, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 1.5F, 3.0F);
        this.Tail.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.4363F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 4, 0.0F, 0.0F, 0.0F, 0, 2, 3, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.Tail.addChild(Tail2);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 25, 21, -0.5F, -1.0F, -0.5F, 1, 2, 6, 0.01F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.Tail2.addChild(Tail3);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 0, 0, 0.0F, -7.0F, 0.0F, 0, 14, 9, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Root.render(f5);
    }
    public void renderStaticWall(float f) {
        this.Root.rotateAngleY = (float) Math.toRadians(90);
        this.Jaw.rotateAngleX = (float) Math.toRadians(25);
        this.Root.offsetY = -0.21F;
        this.Root.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(RPectoral, 0.0F, 0.3927F, -0.6545F);
        this.setRotateAngle(LPectoral, 0.0F, -0.3927F, 0.6545F);
        this.setRotateAngle(RGill, 0.0F, -0.1431F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0F, -0.0436F, 0.0F);
        this.setRotateAngle(LGill, 0.0F, 0.1431F, 0.0F);
        this.setRotateAngle(cube_r3, 0.0F, 0.0436F, 0.0F);
        this.setRotateAngle(lips, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, -1.0488F, 0.0436F, -0.0756F);
        this.setRotateAngle(cube_r5, -1.0488F, -0.0436F, 0.0756F);
        this.setRotateAngle(cube_r6, 0.087F, -0.0511F, 0.0831F);
        this.setRotateAngle(cube_r7, 0.087F, 0.0511F, -0.0831F);
        this.setRotateAngle(rostrum2, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(forehead, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -0.1134F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, -0.087F, -0.0511F, -0.0831F);
        this.setRotateAngle(cube_r10, -0.087F, 0.0511F, 0.0831F);
        this.setRotateAngle(Body2, 0.0F, 0.3054F, 0.0F);
        this.setRotateAngle(cube_r11, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(RPelvic, 0.0F, 0.6545F, -0.6545F);
        this.setRotateAngle(LPelvic, 0.0F, -0.6545F, 0.6545F);
        this.setRotateAngle(Tail, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(cube_r12, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(Tail2, 0.0F, -0.6109F, 0.0F);
        this.setRotateAngle(Tail3, 0.0F, -0.6109F, 0.0F);
        this.Root.rotateAngleY = (float) Math.toRadians(90);
        this.Root.offsetY = -0.5F;
        this.Root.render(0.01F);
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
        //this.Gills.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Gills.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Tail, this.Tail2, this.Tail3};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.7F;
            this.Root.offsetY = 0.1F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.walk(Jaw, (float) (speed * 0.4), 0.25F, true, 0, -0.2F, f2, 1);
            this.walk(LPectoral, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(LPectoral, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(RPectoral, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(RPectoral, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);

            this.walk(LPelvic, (float) (speed * 0.6), 0.1F, true, 0, 0, f2, 1);
            this.swing(LPelvic, (float) (speed * 0.6), 0.1F, true, 0, 0, f2, 1);
            this.walk(RPelvic, (float) (speed * 0.6), 0.1F, true, 0, 0, f2, 1);
            this.swing(RPelvic, (float) (speed * 0.6), 0.1F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                this.Root.rotateAngleZ = (float) Math.toRadians(90);
            } else {
                this.chainWave(fishTail, speed, 0.03F, -3, f2, 1);
                this.chainSwing(fishTail, speed, 0.25F, -2, f2, 1);
                this.swing(Root, speed, 0.1F, true, 0, 0, f2, 1);
            }

        }
    }
}
