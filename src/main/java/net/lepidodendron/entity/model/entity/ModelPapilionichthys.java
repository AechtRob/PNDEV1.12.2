package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelPapilionichthys extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Papilionichthys;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer PectoralL;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer PectoralR;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer AnalL;
    private final AdvancedModelRenderer AnalR;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer Body5;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;

    public ModelPapilionichthys() {
        this.textureWidth = 52;
        this.textureHeight = 52;

        this.Papilionichthys = new AdvancedModelRenderer(this);
        this.Papilionichthys.setRotationPoint(0.0F, 20.25F, 0.0F);


        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 13.0F, 0.0F);
        this.Papilionichthys.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 27, 13, -1.5F, -15.4F, -6.8F, 3, 2, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 15, 16, -2.0F, -15.4F, -4.5F, 4, 5, 3, 0.001F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -14.0F, -7.5F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 1.2741F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 17, 5, -0.9F, -0.48F, -1.57F, 0, 1, 1, -0.001F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 17, 5, 0.9F, -0.48F, -1.57F, 0, 1, 1, -0.001F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 41, 5, -1.0F, -0.58F, -1.17F, 2, 2, 1, -0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -15.4F, -6.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.7854F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 38, 38, -1.0F, -0.5F, -2.5F, 2, 2, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -12.0F, -4.5F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2269F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 15, 25, -1.0F, -2.0F, -2.5F, 3, 2, 3, -0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -9.4F, -1.5F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1833F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 37, 13, -2.0F, -1.0F, -1.1F, 4, 1, 1, -0.001F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 17, 0, -2.0F, -1.0F, -3.2F, 4, 1, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -14.1F, -5.7F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0785F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 30, -2.0F, -0.9787F, -0.9414F, 4, 2, 2, 0.03F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 38, 35, -2.0F, -0.4787F, -0.4414F, 4, 1, 1, 0.04F, false));

        this.PectoralL = new AdvancedModelRenderer(this);
        this.PectoralL.setRotationPoint(1.5F, -15.0F, -2.3F);
        this.head.addChild(PectoralL);
        this.setRotateAngle(PectoralL, 0.0F, 0.0F, 0.6981F);
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 26, 39, -0.5F, -2.0F, -1.2F, 1, 2, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.PectoralL.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2443F, 0.0F, -0.0698F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 33, 33, 0.0F, -8.6F, -0.2F, 0, 9, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.PectoralL.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2356F, 0.0F, -0.0698F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 35, -0.01F, -5.6F, -0.2F, 0, 6, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -2.0F, -1.2F);
        this.PectoralL.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.6632F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 36, 25, 0.0F, -4.7F, -0.4F, 0, 6, 3, 0.0F, false));

        this.PectoralR = new AdvancedModelRenderer(this);
        this.PectoralR.setRotationPoint(-1.5F, -15.0F, -2.3F);
        this.head.addChild(PectoralR);
        this.setRotateAngle(PectoralR, 0.0F, 0.0F, -0.6981F);
        this.PectoralR.cubeList.add(new ModelBox(PectoralR, 26, 39, -0.5F, -2.0F, -1.2F, 1, 2, 2, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.PectoralR.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2443F, 0.0F, 0.0698F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 33, 33, 0.0F, -8.6F, -0.2F, 0, 9, 2, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.PectoralR.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2356F, 0.0F, 0.0698F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 35, 0.01F, -5.6F, -0.2F, 0, 6, 3, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -2.0F, -1.2F);
        this.PectoralR.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.6632F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 36, 25, 0.0F, -4.7F, -0.4F, 0, 6, 3, 0.0F, true));

        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, -13.0F, -1.5F);
        this.head.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 0, 0, -2.0F, -2.4F, -0.1F, 4, 6, 4, 0.0F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 11, -1.5F, -2.4F, -0.7F, 3, 6, 4, -0.001F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -2.4F, -0.1F);
        this.Body2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1047F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, 0.0F, -1.2F, 2.4F, 0, 2, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 25, 5, -1.0F, 0.0F, -0.6F, 2, 1, 4, 0.0F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 3.3F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 15, 6, -1.0F, -1.9F, -1.0F, 2, 4, 5, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 3.6F, 0.0F);
        this.Body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3665F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 22, -1.0F, -1.9629F, -0.0466F, 2, 2, 5, -0.001F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -2.9F, 0.0F);
        this.Body3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2269F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 11, 0.0F, -0.489F, 2.1946F, 0, 1, 1, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 11, 11, 0.0F, -0.789F, 1.0946F, 0, 1, 1, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 15, 16, 0.0F, -0.889F, -0.0054F, 0, 1, 1, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 34, 7, -0.5F, 0.111F, -0.0054F, 1, 1, 4, 0.0F, false));

        this.AnalL = new AdvancedModelRenderer(this);
        this.AnalL.setRotationPoint(0.8F, 3.2F, 0.5F);
        this.Body3.addChild(AnalL);
        this.setRotateAngle(AnalL, 0.4025F, -0.1192F, 0.2724F);
        this.AnalL.cubeList.add(new ModelBox(AnalL, 35, 43, 0.0F, 0.0F, -0.4F, 2, 0, 3, 0.0F, false));

        this.AnalR = new AdvancedModelRenderer(this);
        this.AnalR.setRotationPoint(-0.8F, 3.2F, 0.5F);
        this.Body3.addChild(AnalR);
        this.setRotateAngle(AnalR, 0.4025F, 0.1192F, -0.2724F);
        this.AnalR.cubeList.add(new ModelBox(AnalR, 35, 43, -2.0F, 0.0F, -0.4F, 2, 0, 3, 0.0F, true));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 24, 28, -0.5F, -1.5F, 0.0F, 1, 2, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, 2.0F, 0.1F);
        this.Body4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.4014F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 26, 21, -1.0F, -2.0052F, -0.1738F, 1, 2, 4, -0.001F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, -1.9F, 0.0F);
        this.Body4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0873F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 33, 19, -1.0F, 0.0F, -0.1F, 1, 1, 4, -0.001F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, -0.4F, 4.0F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 7, 37, -0.5F, -1.1F, 0.0F, 1, 2, 3, 0.0F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 19, 33, 0.0F, -1.7F, -0.2F, 0, 3, 4, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, -12.0F, -4.5F);
        this.head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.1396F, 0.0F, 0.0F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.3F, 0.1F);
        this.Jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.3491F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 17, 8, 0.0F, -0.5477F, -4.0966F, 0, 1, 1, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 10, 32, -1.5F, -0.2477F, -2.6966F, 3, 1, 3, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -0.5F, -2.4F);
        this.Jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.2618F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 40, 16, -1.0F, -0.351F, -1.5737F, 2, 1, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.1F, -2.7F);
        this.Jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.6632F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 32, 0, -1.5F, -1.0174F, 0.003F, 3, 1, 3, -0.001F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Papilionichthys.render(f5);
    }
    public void renderStaticWall(float f) {
        this.Papilionichthys.rotateAngleY = (float) Math.toRadians(90);
        this.Papilionichthys.offsetY = -0.2F;
        this.Papilionichthys.offsetX = -0.05F;
        this.Papilionichthys.offsetZ = -0.28F;
        this.Papilionichthys.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(head, -0.3F, 0.0F, 0.0F);
        this.setRotateAngle(Body1, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, -0.3F, 0.0F);
        this.Papilionichthys.offsetY = -0.2F;
        this.Papilionichthys.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Body1, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, 0.3F, 0.0F);
        this.Papilionichthys.offsetY = 0.0F;
        this.Papilionichthys.render(0.01F);
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
        //this.Papilionichthys.offsetY = 1.1F;

        AdvancedModelRenderer[] finLeft = {this.PectoralL};
        AdvancedModelRenderer[] finRight = {this.PectoralR};
        AdvancedModelRenderer[] fishTail = {this.Body2, this.Body3, this.Body4, this.Body5};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {

            if (f3 != 0 || !(e.isInWater())) {
                this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed, 0.5F, -3, f2, 1);
                this.swing(Papilionichthys, speed, 0.3F, true, 0, 0, f2, 1);
            }

            this.walk(Jaw, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);

            this.walk(PectoralL, (float) (speed * 0.75), 0.2F, false, 0, 0, f2, 1);
            this.swing(PectoralL, (float) (speed * 0.75), 0.2F, false, 0, 0, f2, 1);
            this.chainFlap(finLeft, speed, -0.30F, -0.8, f2, 1);

            this.walk(PectoralR, (float) (speed * 0.75), 0.2F, false, 0, 0, f2, 1);
            this.swing(PectoralR, (float) (speed * 0.75), 0.2F, false, 0, 0, f2, 1);
            this.chainFlap(finRight, speed, 0.30F, 0.8, f2, 1);

            this.walk(AnalL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(AnalL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.flap(AnalL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);

            this.walk(AnalR, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            this.swing(AnalR, (float) (speed * 0.75), -0.2F, true, 3, 0, f2, 1);
            this.flap(AnalR, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);

            if (!e.isInWater()) {
                this.Papilionichthys.rotateAngleZ = (float) Math.toRadians(90);
                //this.Papilionichthys.offsetY = 1.25F;
                this.bob(Papilionichthys, -speed, 5F, false, f2, 1);
            }
        }
    }
}
