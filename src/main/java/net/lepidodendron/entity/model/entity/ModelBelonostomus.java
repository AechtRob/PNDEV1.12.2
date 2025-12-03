package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelBelonostomus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Root;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer head2;
    private final AdvancedModelRenderer forehead;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Bsp1_r1;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer GillL;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer GillR;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer PectoralL;
    private final AdvancedModelRenderer PectoralR;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer PelvicL;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer PelvicR2;
    private final AdvancedModelRenderer cube_r12;

    private ModelAnimator animator;

    public ModelBelonostomus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Root = new AdvancedModelRenderer(this);
        this.Root.setRotationPoint(0.0F, 21.25F, 0.0F);


        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.25F, -9.0F);
        this.Root.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 17, 0, -1.0F, -2.0F, -3.25F, 2, 4, 4, -0.02F, false));
        this.Head.cubeList.add(new ModelBox(Head, 7, 0, -1.0F, -1.4F, -4.25F, 2, 3, 1, -0.03F, false));
        this.Head.cubeList.add(new ModelBox(Head, 26, 22, -1.0F, -1.0F, -5.0F, 2, 1, 1, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, 2.0F, -4.25F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 0, -1.5F, -1.0F, 0.0F, 2, 1, 5, 0.0F, false));

        this.head2 = new AdvancedModelRenderer(this);
        this.head2.setRotationPoint(0.0F, 1.0F, -4.0F);
        this.Head.addChild(head2);
        this.setRotateAngle(head2, -0.2758F, 0.0F, 0.0F);
        this.head2.cubeList.add(new ModelBox(head2, 44, 44, -1.0F, -1.0F, -4.0F, 2, 1, 4, 0.0F, false));
        this.head2.cubeList.add(new ModelBox(head2, 0, 10, -1.0F, -2.0F, -2.22F, 2, 1, 2, 0.0F, false));

        this.forehead = new AdvancedModelRenderer(this);
        this.forehead.setRotationPoint(0.0F, -1.0F, -4.0F);
        this.head2.addChild(forehead);
        this.setRotateAngle(forehead, 0.5672F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, 0.8F, 7.6F);
        this.forehead.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 43, 18, -1.5F, 0.0303F, -3.6877F, 2, 1, 4, 0.0F, false));

        this.Bsp1_r1 = new AdvancedModelRenderer(this);
        this.Bsp1_r1.setRotationPoint(0.5F, 1.0F, 0.0F);
        this.forehead.addChild(Bsp1_r1);
        this.setRotateAngle(Bsp1_r1, -0.3054F, 0.0F, 0.0F);
        this.Bsp1_r1.cubeList.add(new ModelBox(Bsp1_r1, 0, 0, -1.0F, -1.0F, -17.2F, 1, 1, 14, 0.0F, false));
        this.Bsp1_r1.cubeList.add(new ModelBox(Bsp1_r1, 13, 35, -1.0F, -1.0F, -3.2F, 1, 1, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, 0.0F, 3.9F);
        this.forehead.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0524F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 23, 9, -1.5F, 0.7F, -2.9F, 2, 1, 1, -0.02F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -0.2F, 0.0F);
        this.forehead.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1134F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 9, 10, -1.0F, -0.0428F, -0.9024F, 1, 1, 1, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 0.0F, 3.9F);
        this.forehead.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1134F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 34, 22, -1.5F, 0.2F, -3.9F, 2, 1, 4, -0.01F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, -0.1F, -0.25F);
        this.head2.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.0698F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 38, 7, -1.0F, -0.0043F, -3.4302F, 2, 1, 4, -0.02F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 0.9957F, -3.4302F);
        this.Jaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0785F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 17, 9, -1.0F, -0.9657F, -2.7F, 1, 1, 3, -0.02F, false));

        this.GillL = new AdvancedModelRenderer(this);
        this.GillL.setRotationPoint(1.0F, 1.0F, -3.9F);
        this.Head.addChild(GillL);
        this.setRotateAngle(GillL, 0.0F, 0.1309F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.GillL.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0349F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 21, 38, -1.0F, -2.5F, 0.0F, 1, 3, 4, 0.0F, false));

        this.GillR = new AdvancedModelRenderer(this);
        this.GillR.setRotationPoint(-1.0F, 1.0F, -3.9F);
        this.Head.addChild(GillR);
        this.setRotateAngle(GillR, 0.0F, -0.1309F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.GillR.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.0349F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 21, 38, 0.0F, -2.5F, 0.0F, 1, 3, 4, 0.0F, true));

        this.PectoralL = new AdvancedModelRenderer(this);
        this.PectoralL.setRotationPoint(1.0F, 1.8F, -0.45F);
        this.Head.addChild(PectoralL);
        this.setRotateAngle(PectoralL, -1.2255F, 0.1372F, -0.6534F);
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 17, 18, 0.0F, -1.5F, 0.0F, 0, 2, 4, 0.0F, false));

        this.PectoralR = new AdvancedModelRenderer(this);
        this.PectoralR.setRotationPoint(-1.0F, 1.8F, -0.45F);
        this.Head.addChild(PectoralR);
        this.setRotateAngle(PectoralR, -1.2255F, -0.1372F, 0.6534F);
        this.PectoralR.cubeList.add(new ModelBox(PectoralR, 17, 18, 0.0F, -1.5F, 0.0F, 0, 2, 4, 0.0F, true));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -0.25F, -9.0F);
        this.Root.addChild(Body);
        this.Body.cubeList.add(new ModelBox(Body, 20, 25, -1.5F, -2.5F, 0.0F, 3, 5, 7, 0.01F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Body.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 16, -1.5F, -2.5F, 0.0F, 3, 5, 10, 0.0F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 22, 7, -1.5F, -2.5F, 0.0F, 3, 5, 9, -0.01F, false));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, 0.0F, 8.5F);
        this.Body3.addChild(Tail);
        this.Tail.cubeList.add(new ModelBox(Tail, 0, 32, -1.0F, -2.0F, -0.5F, 2, 4, 8, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, 2.0F, 3.5F);
        this.Tail.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3578F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -0.5F, -1.7F, -2.9F, 0, 3, 6, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, -2.0F, 4.5F);
        this.Tail.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.6545F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 16, -0.5F, -2.7F, -2.8F, 0, 5, 4, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 7.5F);
        this.Tail.addChild(Tail2);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 42, 28, -0.5F, -1.5F, 0.0F, 1, 3, 4, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Tail2.addChild(Tail3);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 28, 44, -0.5F, -1.0F, 0.0F, 1, 2, 4, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Tail3.addChild(Tail4);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 26, 0, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));
        this.Tail4.cubeList.add(new ModelBox(Tail4, 35, 32, 0.0F, -5.0F, 0.0F, 0, 9, 6, 0.0F, false));

        this.PelvicL = new AdvancedModelRenderer(this);
        this.PelvicL.setRotationPoint(1.5F, 2.5F, 2.0F);
        this.Body3.addChild(PelvicL);
        this.setRotateAngle(PelvicL, 0.2182F, 0.0F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.PelvicL.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -1.3766F, 0.1001F, -0.4702F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, 0.0F, -1.0F, 0.0F, 0, 1, 2, 0.0F, false));

        this.PelvicR2 = new AdvancedModelRenderer(this);
        this.PelvicR2.setRotationPoint(-1.5F, 2.5F, 2.0F);
        this.Body3.addChild(PelvicR2);
        this.setRotateAngle(PelvicR2, 0.2182F, 0.0F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.PelvicR2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -1.3766F, -0.1001F, 0.4702F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, 0.0F, -1.0F, 0.0F, 0, 1, 2, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Root.render(f5 );
    }
    public void renderStaticWall(float f) {
        this.Root.rotateAngleY = (float) Math.toRadians(90);
        this.Root.offsetX = -0.06F;
        this.Root.offsetY = -0.2F;
        this.Root.offsetZ = -0.01F;
        this.Root.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Body, 0.0F, 0.1309F, 0.0436F);
        this.setRotateAngle(Body2, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.3054F, 0.0F);
        this.setRotateAngle(Bsp1_r1, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, -0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, -1.3766F, 0.1001F, -0.4702F);
        this.setRotateAngle(cube_r12, -1.3766F, -0.1001F, 0.4702F);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, -0.1134F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -0.1134F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 0.0785F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.0F, 0.0349F, 0.0F);
        this.setRotateAngle(cube_r8, 0.0F, -0.0349F, 0.0F);
        this.setRotateAngle(cube_r9, 0.3578F, 0.0F, 0.0F);
        this.setRotateAngle(forehead, 0.5672F, 0.0F, 0.0F);
        this.setRotateAngle(GillL, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(GillR, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(Head, 0.0F, -0.0436F, 0.0F);
        this.setRotateAngle(head2, -0.2758F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.3665F, 0.0F, 0.0F);
        this.setRotateAngle(PectoralL, -1.2255F, 0.1372F, -0.6534F);
        this.setRotateAngle(PectoralR, -1.2255F, -0.1372F, 0.6534F);
        this.setRotateAngle(PelvicL, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(PelvicR2, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(Root, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(Tail, 0.0F, 0.3927F, 0.0F);
        this.setRotateAngle(Tail2, 0.0F, 0.3491F, 0.0F);
        this.setRotateAngle(Tail3, 0.0F, 0.3054F, 0.0F);
        this.setRotateAngle(Tail4, 0.0F, 0.2618F, 0.0F);
        this.Root.offsetX = 0.01F;
        this.Root.offsetY = -0.3F;
        this.Root.offsetZ = -0.08F;
        this.Root.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Root.offsetY = -1.0F;
        this.Root.offsetX = 0.6F;
        this.Root.offsetZ = 1.0F;
        this.Root.rotateAngleY = (float)Math.toRadians(120);
        this.Root.rotateAngleX = (float)Math.toRadians(1);
        this.Root.rotateAngleZ = (float)Math.toRadians(0);
        this.Root.scaleChildren = true;
        float scaler = 1.0F;
        this.Root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Root, 0.2F, 3.8F, -0.0F);
        this.setRotateAngle(Body, 0.0F, 0.1309F, 0.0436F);
        this.setRotateAngle(Body2, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.3054F, 0.0F);
        this.setRotateAngle(Bsp1_r1, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, -0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, -1.3766F, 0.1001F, -0.4702F);
        this.setRotateAngle(cube_r12, -1.3766F, -0.1001F, 0.4702F);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, -0.1134F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -0.1134F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 0.0785F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.0F, 0.0349F, 0.0F);
        this.setRotateAngle(cube_r8, 0.0F, -0.0349F, 0.0F);
        this.setRotateAngle(cube_r9, 0.3578F, 0.0F, 0.0F);
        this.setRotateAngle(forehead, 0.5672F, 0.0F, 0.0F);
        this.setRotateAngle(GillL, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(GillR, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(Head, 0.0F, -0.0436F, 0.0F);
        this.setRotateAngle(head2, -0.2758F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.3665F, 0.0F, 0.0F);
        this.setRotateAngle(PectoralL, -1.2255F, 0.1372F, -0.6534F);
        this.setRotateAngle(PectoralR, -1.2255F, -0.1372F, 0.6534F);
        this.setRotateAngle(PelvicL, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(PelvicR2, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(Tail, 0.0F, 0.3927F, 0.0F);
        this.setRotateAngle(Tail2, 0.0F, 0.3491F, 0.0F);
        this.setRotateAngle(Tail3, 0.0F, 0.3054F, 0.0F);
        this.setRotateAngle(Tail4, 0.0F, 0.2618F, 0.0F);
        //End of pose, now render the model:
        this.Root.render(f);
        //Reset rotations, positions and sizing:
        this.Root.setScale(1.0F, 1.0F, 1.0F);
        this.Root.scaleChildren = false;
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

        AdvancedModelRenderer[] fishTail = {this.Body2, this.Body3, this.Tail, this.Tail2, this.Tail3, this.Tail4};
        float speed = 0.25F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.03F, -2, f2, 1);
            this.chainSwing(fishTail, speed, 0.24F, -1, f2, 1);
            this.swing(Root, speed, 0.2F, true, 0, 0, f2, 1);
            //this.walk(lowerjaw, (float) (speed * 0.75), (float)Math.toRadians(10D), true, 0, 0, f2, 1);
            this.walk(PectoralL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(PectoralL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(PectoralR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(PectoralR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.flap(PelvicL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.flap(PelvicR2, (float) (speed * 0.75), -0.2F, true, 0, 0, f2, 1);

            if (!e.isInWater()) {
                this.Root.rotateAngleZ = (float) Math.toRadians(90);
                    this.Root.offsetY = 0;
                this.bob(Root, -speed, 5F, false, f2, 1);
            }
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        //animator.move(this.upperjaw, 0,0,-0.5F);
        animator.rotate(this.Jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

