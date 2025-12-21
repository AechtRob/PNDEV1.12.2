package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPetrolacosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelPetrolacosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer leftfoot;
    private final AdvancedModelRenderer rightleg;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer rightfoot;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer leftarm;
    private final AdvancedModelRenderer leftarm2;
    private final AdvancedModelRenderer lefthand;
    private final AdvancedModelRenderer rightarm;
    private final AdvancedModelRenderer rightarm2;
    private final AdvancedModelRenderer righthand;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer TOPFACE;
    private final AdvancedModelRenderer bone3;
    private final AdvancedModelRenderer LEFTFACE;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer RIGHTFACE;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer LEFTJAW;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer RIGHTJAW;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;

    private ModelAnimator animator;

    public ModelPetrolacosaurus() {
        this.textureWidth = 42;
        this.textureHeight = 37;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 20.05F, 5.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.75F, -1.25F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 25, -1.5F, 0.05F, -0.25F, 3, 3, 3, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, -1.75F, -1.25F);
        this.hips.addChild(bone);


        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(1.5F, 0.0F, 0.0F);
        this.hips.addChild(leftleg);
        this.setRotateAngle(leftleg, 0.5604F, -0.9521F, -0.4626F);
        this.leftleg.cubeList.add(new ModelBox(leftleg, 30, 30, -0.5F, -1.0F, -3.0F, 1, 2, 4, 0.01F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, -0.1745F, 0.0F, 0.0F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 0, 13, -0.5F, -0.5F, -1.0F, 1, 4, 1, 0.0F, false));
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 0, 13, -0.5F, -0.5F, -0.5F, 1, 4, 1, -0.01F, false));

        this.leftfoot = new AdvancedModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.leftleg2.addChild(leftfoot);
        this.setRotateAngle(leftfoot, 0.0F, 0.0F, 0.2618F);
        this.leftfoot.cubeList.add(new ModelBox(leftfoot, 12, 13, -3.0F, 0.0F, -5.0F, 5, 0, 5, 0.0F, false));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-1.5F, 0.0F, 0.0F);
        this.hips.addChild(rightleg);
        this.setRotateAngle(rightleg, 0.5604F, 0.9521F, 0.4626F);
        this.rightleg.cubeList.add(new ModelBox(rightleg, 30, 30, -0.5F, -1.0F, -3.0F, 1, 2, 4, 0.01F, true));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, -0.1745F, 0.0F, 0.0F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 0, 13, -0.5F, -0.5F, -1.0F, 1, 4, 1, 0.0F, true));
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 0, 13, -0.5F, -0.5F, -0.5F, 1, 4, 1, -0.01F, true));

        this.rightfoot = new AdvancedModelRenderer(this);
        this.rightfoot.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.rightleg2.addChild(rightfoot);
        this.setRotateAngle(rightfoot, 0.0F, 0.0F, -0.2618F);
        this.rightfoot.cubeList.add(new ModelBox(rightfoot, 12, 13, -2.0F, 0.0F, -5.0F, 5, 0, 5, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.0F, 1.25F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.3054F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 13, -1.0F, -0.4F, 0.0F, 2, 2, 7, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.6F, 6.9F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1309F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 12, 19, -0.5F, -0.25F, -0.15F, 1, 1, 7, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 12, 19, -0.5F, -0.75F, -0.15F, 1, 1, 7, -0.01F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.05F, 6.75F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1309F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 22, 21, -0.5F, -0.45F, -0.15F, 1, 1, 7, -0.02F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.0F, -1.35F);
        this.hips.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -0.75F, -7.9F, 4, 4, 8, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.0F, -7.9F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0873F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 25, 5, -1.5F, -0.7F, -2.75F, 3, 3, 3, 0.0F, false));

        this.leftarm = new AdvancedModelRenderer(this);
        this.leftarm.setRotationPoint(1.5F, 1.0F, -1.25F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, -0.3491F, -0.3491F, 0.0F);
        this.leftarm.cubeList.add(new ModelBox(leftarm, 17, 5, -0.5F, 0.25F, -0.5F, 3, 1, 1, 0.01F, false));
        this.leftarm.cubeList.add(new ModelBox(leftarm, 17, 5, -0.5F, -0.25F, -0.5F, 3, 1, 1, 0.0F, false));

        this.leftarm2 = new AdvancedModelRenderer(this);
        this.leftarm2.setRotationPoint(2.25F, 0.5F, 0.0F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, 0.0F, 0.0F, 0.2182F);
        this.leftarm2.cubeList.add(new ModelBox(leftarm2, 22, 19, -0.25F, -0.45F, -0.5F, 1, 4, 1, -0.01F, false));

        this.lefthand = new AdvancedModelRenderer(this);
        this.lefthand.setRotationPoint(0.25F, 3.55F, -0.5F);
        this.leftarm2.addChild(lefthand);
        this.setRotateAngle(lefthand, 0.2618F, 0.0F, -0.1745F);
        this.lefthand.cubeList.add(new ModelBox(lefthand, 17, 0, -1.5F, 0.0F, -3.0F, 3, 0, 4, 0.0F, false));

        this.rightarm = new AdvancedModelRenderer(this);
        this.rightarm.setRotationPoint(-1.5F, 1.0F, -1.25F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, -0.3491F, 0.3491F, 0.0F);
        this.rightarm.cubeList.add(new ModelBox(rightarm, 17, 5, -2.5F, 0.25F, -0.5F, 3, 1, 1, 0.01F, true));
        this.rightarm.cubeList.add(new ModelBox(rightarm, 17, 5, -2.5F, -0.25F, -0.5F, 3, 1, 1, 0.0F, true));

        this.rightarm2 = new AdvancedModelRenderer(this);
        this.rightarm2.setRotationPoint(-2.25F, 0.5F, 0.0F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, 0.0F, 0.0F, -0.2182F);
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 22, 19, -0.75F, -0.45F, -0.5F, 1, 4, 1, -0.01F, true));

        this.righthand = new AdvancedModelRenderer(this);
        this.righthand.setRotationPoint(-0.25F, 3.55F, -0.5F);
        this.rightarm2.addChild(righthand);
        this.setRotateAngle(righthand, 0.2618F, 0.0F, 0.1745F);
        this.righthand.cubeList.add(new ModelBox(righthand, 17, 0, -1.5F, 0.0F, -3.0F, 3, 0, 4, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.25F, -2.75F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.0436F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 9, 28, -1.0F, -0.9F, -3.75F, 2, 2, 4, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.5F, 0.15F, -3.4F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.0436F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 17, 30, -1.0F, -0.55F, -4.7F, 1, 1, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -0.6F, -2.85F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0681F, -0.2513F, 0.2705F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 28, 12, -0.7103F, -0.2591F, 0.2371F, 1, 1, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -0.6F, -2.85F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0681F, 0.2513F, -0.2705F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 12, -0.2897F, -0.2591F, 0.2371F, 1, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, 0.7F, -4.65F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 12, 13, -0.5F, -1.0F, 0.0F, 1, 1, 1, -0.02F, false));

        this.TOPFACE = new AdvancedModelRenderer(this);
        this.TOPFACE.setRotationPoint(-0.5F, -0.55F, -4.05F);
        this.head.addChild(TOPFACE);
        this.setRotateAngle(TOPFACE, 0.2618F, 0.0F, 0.0F);
        this.TOPFACE.cubeList.add(new ModelBox(TOPFACE, 0, 0, -0.5F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.bone3 = new AdvancedModelRenderer(this);
        this.bone3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.TOPFACE.addChild(bone3);
        this.setRotateAngle(bone3, -0.2182F, 0.0F, 0.0F);
        this.bone3.cubeList.add(new ModelBox(bone3, 28, 0, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.01F, false));
        this.bone3.cubeList.add(new ModelBox(bone3, 0, 4, -1.0F, 0.0F, 1.0F, 2, 1, 1, 0.0F, false));

        this.LEFTFACE = new AdvancedModelRenderer(this);
        this.LEFTFACE.setRotationPoint(0.0F, -0.05F, -4.1F);
        this.head.addChild(LEFTFACE);
        this.setRotateAngle(LEFTFACE, 0.0F, 0.2182F, 0.0F);
        this.LEFTFACE.cubeList.add(new ModelBox(LEFTFACE, 32, 21, -1.0F, -0.5F, 0.0F, 1, 1, 4, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.75F, -0.55F);
        this.LEFTFACE.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 17, 0, -0.1F, -1.0F, 2.25F, 0, 1, 1, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 17, 0, -0.1F, -1.0F, 1.1F, 0, 1, 1, 0.0F, false));

        this.RIGHTFACE = new AdvancedModelRenderer(this);
        this.RIGHTFACE.setRotationPoint(-1.0F, -0.05F, -4.1F);
        this.head.addChild(RIGHTFACE);
        this.setRotateAngle(RIGHTFACE, 0.0F, -0.2182F, 0.0F);
        this.RIGHTFACE.cubeList.add(new ModelBox(RIGHTFACE, 32, 21, 0.0F, -0.5F, 0.0F, 1, 1, 4, -0.01F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.75F, -0.55F);
        this.RIGHTFACE.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0436F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 17, 0, 0.1F, -1.0F, 2.25F, 0, 1, 1, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 17, 0, 0.1F, -1.0F, 1.1F, 0, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 0.5F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0436F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 28, 14, -0.5F, -0.5F, -4.68F, 1, 1, 5, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, -0.7F, -4.6F);
        this.jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 12, 13, -1.0F, -0.05F, -0.03F, 1, 1, 1, -0.03F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.9F, -0.45F, -1.4F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.7418F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 10, 23, -1.9F, -0.75F, 0.0F, 2, 1, 1, 0.0F, false));

        this.LEFTJAW = new AdvancedModelRenderer(this);
        this.LEFTJAW.setRotationPoint(0.5F, 0.0F, -4.0F);
        this.jaw.addChild(LEFTJAW);
        this.setRotateAngle(LEFTJAW, 0.0F, 0.2531F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.7F, -0.6F);
        this.LEFTJAW.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0436F, -0.0436F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 17, 0, -0.0238F, -0.05F, 2.1494F, 0, 1, 1, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 17, 0, -0.0238F, -0.05F, 0.9994F, 0, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LEFTJAW.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.0436F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 32, -1.0F, -0.5F, -0.15F, 1, 1, 4, -0.02F, false));

        this.RIGHTJAW = new AdvancedModelRenderer(this);
        this.RIGHTJAW.setRotationPoint(-0.5F, 0.0F, -4.0F);
        this.jaw.addChild(RIGHTJAW);
        this.setRotateAngle(RIGHTJAW, 0.0F, -0.2531F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.7F, -0.6F);
        this.RIGHTJAW.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0436F, 0.0436F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 17, 0, 0.0238F, -0.05F, 2.1494F, 0, 1, 1, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 17, 0, 0.0238F, -0.05F, 0.9994F, 0, 1, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RIGHTJAW.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0436F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 32, 0.0F, -0.5F, -0.15F, 1, 1, 4, -0.02F, true));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }
    public void renderStaticWall(float f) {
        this.hips.rotateAngleX = (float) Math.toRadians(90);
        this.hips.offsetY = -0.17F;
        this.hips.offsetX = -0F;
        this.hips.offsetZ = -0.245F;
        this.hips.rotateAngleZ = (float)Math.toRadians(180);
        this.hips.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(bone3, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(chest, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, 0.0F, -0.0436F, 0.0F);
        this.setRotateAngle(cube_r11, -0.0436F, 0.0436F, 0.0F);
        this.setRotateAngle(cube_r12, 0.0F, 0.0436F, 0.0F);
        this.setRotateAngle(cube_r2, -0.0681F, -0.2513F, 0.2705F);
        this.setRotateAngle(cube_r3, -0.0681F, 0.2513F, -0.2705F);
        this.setRotateAngle(cube_r4, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -0.7418F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, -0.0436F, -0.0436F, 0.0F);
        this.setRotateAngle(head, -0.2399F, 0.0523F, 0.0023F);
        this.setRotateAngle(hips, 0.0916F, -0.1396F, 0.0F);
        this.setRotateAngle(jaw, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(leftarm, -0.069F, -0.484F, -0.6691F);
        this.setRotateAngle(leftarm2, 0.0F, 0.0F, 0.2182F);
        this.setRotateAngle(LEFTFACE, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(leftfoot, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(lefthand, 0.3431F, -0.1396F, 0.3542F);
        this.setRotateAngle(LEFTJAW, 0.0F, 0.2531F, 0.0F);
        this.setRotateAngle(leftleg, 0.0979F, -0.9521F, -0.4626F);
        this.setRotateAngle(leftleg2, 0.2481F, -0.0172F, 0.0677F);
        this.setRotateAngle(neck, -0.2096F, 0.0959F, -0.0042F);
        this.setRotateAngle(rightarm, -0.0322F, 0.4876F, 0.7479F);
        this.setRotateAngle(rightarm2, 0.0F, 0.0F, -0.3316F);
        this.setRotateAngle(RIGHTFACE, 0.0F, -0.2182F, 0.0F);
        this.setRotateAngle(rightfoot, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(righthand, 0.3391F, 0.1178F, -0.2828F);
        this.setRotateAngle(RIGHTJAW, 0.0F, -0.2531F, 0.0F);
        this.setRotateAngle(rightleg, 0.1459F, 0.9521F, 0.4626F);
        this.setRotateAngle(rightleg2, 0.148F, 0.011F, -0.0734F);
        this.setRotateAngle(tail, 0.1179F, 0.0477F, 0.0056F);
        this.setRotateAngle(tail2, 0.339F, 0.1318F, 0.0463F);
        this.setRotateAngle(tail3, 0.484F, 0.2879F, 0.1482F);
        this.setRotateAngle(TOPFACE, 0.2618F, 0.0F, 0.0F);
        this.hips.offsetY = 0.103F;
        this.hips.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = -1.3F;
        this.hips.offsetX = 1.2F;
        this.hips.offsetZ = 2.0F;
        this.hips.rotateAngleY = (float)Math.toRadians(200);
        this.hips.rotateAngleX = (float)Math.toRadians(8);
        this.hips.rotateAngleZ = (float)Math.toRadians(-8);
        this.hips.scaleChildren = true;
        float scaler = 4.0F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
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
        //this.resetToDefaultPose();
        //this.hips.offsetY = 1.28F;

        EntityPrehistoricFloraPetrolacosaurus Petrolacosaurus = (EntityPrehistoricFloraPetrolacosaurus) e;
        float masterSpeed = Petrolacosaurus.getTravelSpeed();

        this.faceTarget(f3, f4, 2, neck);
        this.faceTarget(f3, f4, 4, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3};

        if (Petrolacosaurus.getAnimation() == Petrolacosaurus.MAKE_NEST_ANIMATION) {
            //this.swing(Neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            //this.walk(Neck, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            return;
        }


        if (Petrolacosaurus.getIsClimbing()) {
            //Pose for climbing:
            //this.hips.offsetY = 1.40F;
        }

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraPetrolacosaurus ee = (EntityPrehistoricFloraPetrolacosaurus) entitylivingbaseIn;


        if(ee.getIsMoving()) {
            if (ee.getIsFast()) {
                if (ee.getIsClimbing()) {
                    if(!ee.getHeadCollided()) {
                        animClimb(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                    } else {
                        animClimb(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                    }
                } else {
                    animRun(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            } else {
                if (ee.getIsClimbing()) {
                    if(!ee.getHeadCollided()) {
                        animClimb(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                    } else {
                        animClimb(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                    }
                } else {
                    animWalk(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }

        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPetrolacosaurus entity = (EntityPrehistoricFloraPetrolacosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (14.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 14.75 + (((tickAnim - 10) / 10) * (0-(14.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (19-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 19 + (((tickAnim - 5) / 5) * (8.5-(19)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 8.5 + (((tickAnim - 10) / 10) * (0-(8.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.225-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0.225 + (((tickAnim - 5) / 5) * (0-(0.225)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (19.5-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 19.5 + (((tickAnim - 8) / 2) * (0-(19.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
    }
    public void animRun(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPetrolacosaurus entity = (EntityPrehistoricFloraPetrolacosaurus) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5))*1), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*15), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*4));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*0.5);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-50))*0.2);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-100))*0.5);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 80.60563 + (((tickAnim - 0) / 3) * (41.7766-(80.60563)));
            yy = 30.81336 + (((tickAnim - 0) / 3) * (34.50802-(30.81336)));
            zz = -51.17396 + (((tickAnim - 0) / 3) * (-71.02225-(-51.17396)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 41.7766 + (((tickAnim - 3) / 2) * (-18.34367-(41.7766)));
            yy = 34.50802 + (((tickAnim - 3) / 2) * (17.75798-(34.50802)));
            zz = -71.02225 + (((tickAnim - 3) / 2) * (21.67606-(-71.02225)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -18.34367 + (((tickAnim - 5) / 5) * (80.60563-(-18.34367)));
            yy = 17.75798 + (((tickAnim - 5) / 5) * (30.81336-(17.75798)));
            zz = 21.67606 + (((tickAnim - 5) / 5) * (-51.17396-(21.67606)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (10.65773-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (-0.05465-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (4.74969-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = 10.65773 + (((tickAnim - 1) / 3) * (-39.76-(10.65773)));
            yy = -0.05465 + (((tickAnim - 1) / 3) * (0-(-0.05465)));
            zz = 4.74969 + (((tickAnim - 1) / 3) * (0-(4.74969)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -39.76 + (((tickAnim - 4) / 1) * (-21.5-(-39.76)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -21.5 + (((tickAnim - 5) / 5) * (0-(-21.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 6.47285 + (((tickAnim - 0) / 2) * (78.40352-(6.47285)));
            yy = -11.04327 + (((tickAnim - 0) / 2) * (-13.64197-(-11.04327)));
            zz = 39.7645 + (((tickAnim - 0) / 2) * (-8.13925-(39.7645)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 78.40352 + (((tickAnim - 2) / 2) * (22.34321-(78.40352)));
            yy = -13.64197 + (((tickAnim - 2) / 2) * (-11.41491-(-13.64197)));
            zz = -8.13925 + (((tickAnim - 2) / 2) * (47.82759-(-8.13925)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 22.34321 + (((tickAnim - 4) / 1) * (20.68275-(22.34321)));
            yy = -11.41491 + (((tickAnim - 4) / 1) * (-4.27796-(-11.41491)));
            zz = 47.82759 + (((tickAnim - 4) / 1) * (-12.59037-(47.82759)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 20.68275 + (((tickAnim - 5) / 3) * (-9.63254-(20.68275)));
            yy = -4.27796 + (((tickAnim - 5) / 3) * (-6.31267-(-4.27796)));
            zz = -12.59037 + (((tickAnim - 5) / 3) * (18.80153-(-12.59037)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -9.63254 + (((tickAnim - 8) / 1) * (-9.32984-(-9.63254)));
            yy = -6.31267 + (((tickAnim - 8) / 1) * (-8.67797-(-6.31267)));
            zz = 18.80153 + (((tickAnim - 8) / 1) * (29.28301-(18.80153)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -9.32984 + (((tickAnim - 9) / 1) * (6.47285-(-9.32984)));
            yy = -8.67797 + (((tickAnim - 9) / 1) * (-11.04327-(-8.67797)));
            zz = 29.28301 + (((tickAnim - 9) / 1) * (39.7645-(29.28301)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0.475-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (1.775-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0.475 + (((tickAnim - 2) / 2) * (0-(0.475)));
            yy = 1.775 + (((tickAnim - 2) / 2) * (0-(1.775)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 1) * (0.5-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 5) / 1) * (0.975-(0.5)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0.975 + (((tickAnim - 6) / 1) * (1.075-(0.975)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 1.075 + (((tickAnim - 7) / 1) * (0.775-(1.075)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0.775 + (((tickAnim - 8) / 0) * (0.825-(0.775)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.825 + (((tickAnim - 8) / 2) * (0-(0.825)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -18.34367 + (((tickAnim - 0) / 3) * (31.80894-(-18.34367)));
            yy = -17.75798 + (((tickAnim - 0) / 3) * (-14.15936-(-17.75798)));
            zz = -21.67606 + (((tickAnim - 0) / 3) * (23.58694-(-21.67606)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 31.80894 + (((tickAnim - 3) / 2) * (80.60563-(31.80894)));
            yy = -14.15936 + (((tickAnim - 3) / 2) * (-30.81336-(-14.15936)));
            zz = 23.58694 + (((tickAnim - 3) / 2) * (51.17396-(23.58694)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 80.60563 + (((tickAnim - 5) / 3) * (41.7766-(80.60563)));
            yy = -30.81336 + (((tickAnim - 5) / 3) * (-34.50802-(-30.81336)));
            zz = 51.17396 + (((tickAnim - 5) / 3) * (71.02225-(51.17396)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 41.7766 + (((tickAnim - 8) / 2) * (-18.34367-(41.7766)));
            yy = -34.50802 + (((tickAnim - 8) / 2) * (-17.75798-(-34.50802)));
            zz = 71.02225 + (((tickAnim - 8) / 2) * (-21.67606-(71.02225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -21.5 + (((tickAnim - 0) / 5) * (0-(-21.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (10.65773-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (-0.05465-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (4.74969-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 10.65773 + (((tickAnim - 6) / 3) * (-39.76-(10.65773)));
            yy = -0.05465 + (((tickAnim - 6) / 3) * (0-(-0.05465)));
            zz = 4.74969 + (((tickAnim - 6) / 3) * (0-(4.74969)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -39.76 + (((tickAnim - 9) / 1) * (-21.5-(-39.76)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 20.68275 + (((tickAnim - 0) / 3) * (-1.88254-(20.68275)));
            yy = 4.27796 + (((tickAnim - 0) / 3) * (6.31267-(4.27796)));
            zz = 12.59037 + (((tickAnim - 0) / 3) * (-18.80153-(12.59037)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -1.88254 + (((tickAnim - 3) / 1) * (-6.32984-(-1.88254)));
            yy = 6.31267 + (((tickAnim - 3) / 1) * (8.67797-(6.31267)));
            zz = -18.80153 + (((tickAnim - 3) / 1) * (-29.28301-(-18.80153)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -6.32984 + (((tickAnim - 4) / 1) * (6.47285-(-6.32984)));
            yy = 8.67797 + (((tickAnim - 4) / 1) * (11.04327-(8.67797)));
            zz = -29.28301 + (((tickAnim - 4) / 1) * (-39.7645-(-29.28301)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 6.47285 + (((tickAnim - 5) / 2) * (78.40352-(6.47285)));
            yy = 11.04327 + (((tickAnim - 5) / 2) * (13.64197-(11.04327)));
            zz = -39.7645 + (((tickAnim - 5) / 2) * (8.13925-(-39.7645)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 78.40352 + (((tickAnim - 7) / 2) * (22.34321-(78.40352)));
            yy = 13.64197 + (((tickAnim - 7) / 2) * (11.41491-(13.64197)));
            zz = 8.13925 + (((tickAnim - 7) / 2) * (-47.82759-(8.13925)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 22.34321 + (((tickAnim - 9) / 1) * (20.68275-(22.34321)));
            yy = 11.41491 + (((tickAnim - 9) / 1) * (4.27796-(11.41491)));
            zz = -47.82759 + (((tickAnim - 9) / 1) * (12.59037-(-47.82759)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0.525 + (((tickAnim - 0) / 1) * (0.825-(0.525)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 0.825 + (((tickAnim - 1) / 1) * (0.725-(0.825)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.725 + (((tickAnim - 2) / 1) * (0.125-(0.725)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0.125 + (((tickAnim - 3) / 0) * (0.15-(0.125)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.15 + (((tickAnim - 3) / 2) * (0-(0.15)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (1.475-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 1.475 + (((tickAnim - 7) / 2) * (0-(1.475)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 1) * (0.525-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-20), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*-2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*-25), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*-2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*-30), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*-2));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-80))*-15), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+50))*-15), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*-4));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (33.05595-(0)));
            yy = 52.75 + (((tickAnim - 0) / 5) * (-36.06912-(52.75)));
            zz = 0 + (((tickAnim - 0) / 5) * (-19.48863-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 33.05595 + (((tickAnim - 5) / 3) * (-14.20756-(33.05595)));
            yy = -36.06912 + (((tickAnim - 5) / 3) * (5.72442-(-36.06912)));
            zz = -19.48863 + (((tickAnim - 5) / 3) * (-26.6295-(-19.48863)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -14.20756 + (((tickAnim - 8) / 2) * (0-(-14.20756)));
            yy = 5.72442 + (((tickAnim - 8) / 2) * (52.75-(5.72442)));
            zz = -26.6295 + (((tickAnim - 8) / 2) * (0-(-26.6295)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -13.25 + (((tickAnim - 0) / 5) * (0-(-13.25)));
            yy = -19.5 + (((tickAnim - 0) / 5) * (0-(-19.5)));
            zz = -25.75 + (((tickAnim - 0) / 5) * (-45.75-(-25.75)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (12.1222-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (-2.7256-(0)));
            zz = -45.75 + (((tickAnim - 5) / 2) * (-32.30097-(-45.75)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 12.1222 + (((tickAnim - 7) / 1) * (-25.125-(12.1222)));
            yy = -2.7256 + (((tickAnim - 7) / 1) * (-9.75-(-2.7256)));
            zz = -32.30097 + (((tickAnim - 7) / 1) * (-23.25-(-32.30097)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -25.125 + (((tickAnim - 8) / 2) * (-13.25-(-25.125)));
            yy = -9.75 + (((tickAnim - 8) / 2) * (-19.5-(-9.75)));
            zz = -23.25 + (((tickAnim - 8) / 2) * (-25.75-(-23.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.275 + (((tickAnim - 0) / 5) * (0-(-0.275)));
            zz = -0.15 + (((tickAnim - 0) / 5) * (0-(-0.15)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (-0.15-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm2.rotationPointX = this.leftarm2.rotationPointX + (float)(xx);
        this.leftarm2.rotationPointY = this.leftarm2.rotationPointY - (float)(yy);
        this.leftarm2.rotationPointZ = this.leftarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 15.70789 + (((tickAnim - 0) / 3) * (19.4925-(15.70789)));
            yy = -1.76941 + (((tickAnim - 0) / 3) * (-3.13992-(-1.76941)));
            zz = 13.72655 + (((tickAnim - 0) / 3) * (25.65872-(13.72655)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 19.4925 + (((tickAnim - 3) / 2) * (21.97399-(19.4925)));
            yy = -3.13992 + (((tickAnim - 3) / 2) * (-0.57076-(-3.13992)));
            zz = 25.65872 + (((tickAnim - 3) / 2) * (25.71897-(25.65872)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 21.97399 + (((tickAnim - 5) / 2) * (94.96862-(21.97399)));
            yy = -0.57076 + (((tickAnim - 5) / 2) * (-0.97031-(-0.57076)));
            zz = 25.71897 + (((tickAnim - 5) / 2) * (21.72149-(25.71897)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 94.96862 + (((tickAnim - 7) / 1) * (104.46594-(94.96862)));
            yy = -0.97031 + (((tickAnim - 7) / 1) * (-1.17009-(-0.97031)));
            zz = 21.72149 + (((tickAnim - 7) / 1) * (19.72276-(21.72149)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 104.46594 + (((tickAnim - 8) / 2) * (15.70789-(104.46594)));
            yy = -1.17009 + (((tickAnim - 8) / 2) * (-1.76941-(-1.17009)));
            zz = 19.72276 + (((tickAnim - 8) / 2) * (13.72655-(19.72276)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = -0.025 + (((tickAnim - 0) / 1) * (0.445-(-0.025)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 0.445 + (((tickAnim - 1) / 1) * (0.365-(0.445)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.365 + (((tickAnim - 2) / 1) * (0-(0.365)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0.175-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0.175 + (((tickAnim - 5) / 1) * (0.66-(0.175)));
            zz = 0 + (((tickAnim - 5) / 1) * (0.2-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.66 + (((tickAnim - 6) / 2) * (0.41-(0.66)));
            zz = 0.2 + (((tickAnim - 6) / 2) * (0.6-(0.2)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.41 + (((tickAnim - 8) / 1) * (0.395-(0.41)));
            zz = 0.6 + (((tickAnim - 8) / 1) * (0.3-(0.6)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0.395 + (((tickAnim - 9) / 1) * (-0.175-(0.395)));
            zz = 0.3 + (((tickAnim - 9) / 1) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefthand.rotationPointX = this.lefthand.rotationPointX + (float)(xx);
        this.lefthand.rotationPointY = this.lefthand.rotationPointY - (float)(yy);
        this.lefthand.rotationPointZ = this.lefthand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 33.05595 + (((tickAnim - 0) / 3) * (-14.20756-(33.05595)));
            yy = 36.06912 + (((tickAnim - 0) / 3) * (-5.72442-(36.06912)));
            zz = 19.48863 + (((tickAnim - 0) / 3) * (26.6295-(19.48863)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -14.20756 + (((tickAnim - 3) / 2) * (0-(-14.20756)));
            yy = -5.72442 + (((tickAnim - 3) / 2) * (-52.75-(-5.72442)));
            zz = 26.6295 + (((tickAnim - 3) / 2) * (0-(26.6295)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (33.05595-(0)));
            yy = -52.75 + (((tickAnim - 5) / 5) * (36.06912-(-52.75)));
            zz = 0 + (((tickAnim - 5) / 5) * (19.48863-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (12.1222-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (2.7256-(0)));
            zz = 45.75 + (((tickAnim - 0) / 2) * (32.30097-(45.75)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 12.1222 + (((tickAnim - 2) / 1) * (-25.125-(12.1222)));
            yy = 2.7256 + (((tickAnim - 2) / 1) * (9.75-(2.7256)));
            zz = 32.30097 + (((tickAnim - 2) / 1) * (23.25-(32.30097)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -25.125 + (((tickAnim - 3) / 2) * (-13.25-(-25.125)));
            yy = 9.75 + (((tickAnim - 3) / 2) * (19.5-(9.75)));
            zz = 23.25 + (((tickAnim - 3) / 2) * (25.75-(23.25)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -13.25 + (((tickAnim - 5) / 5) * (0-(-13.25)));
            yy = 19.5 + (((tickAnim - 5) / 5) * (0-(19.5)));
            zz = 25.75 + (((tickAnim - 5) / 5) * (45.75-(25.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.15-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -0.275 + (((tickAnim - 5) / 5) * (0-(-0.275)));
            zz = -0.15 + (((tickAnim - 5) / 5) * (0-(-0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm2.rotationPointX = this.rightarm2.rotationPointX + (float)(xx);
        this.rightarm2.rotationPointY = this.rightarm2.rotationPointY - (float)(yy);
        this.rightarm2.rotationPointZ = this.rightarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 21.97399 + (((tickAnim - 0) / 2) * (98.67595-(21.97399)));
            yy = 0.57076 + (((tickAnim - 0) / 2) * (0.80277-(0.57076)));
            zz = -25.71897 + (((tickAnim - 0) / 2) * (-23.3977-(-25.71897)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 98.67595 + (((tickAnim - 2) / 1) * (80.55341-(98.67595)));
            yy = 0.80277 + (((tickAnim - 2) / 1) * (1.09279-(0.80277)));
            zz = -23.3977 + (((tickAnim - 2) / 1) * (-20.49612-(-23.3977)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 80.55341 + (((tickAnim - 3) / 2) * (15.70789-(80.55341)));
            yy = 1.09279 + (((tickAnim - 3) / 2) * (1.76941-(1.09279)));
            zz = -20.49612 + (((tickAnim - 3) / 2) * (-13.72655-(-20.49612)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 15.70789 + (((tickAnim - 5) / 3) * (19.4925-(15.70789)));
            yy = 1.76941 + (((tickAnim - 5) / 3) * (3.13992-(1.76941)));
            zz = -13.72655 + (((tickAnim - 5) / 3) * (-25.65872-(-13.72655)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 19.4925 + (((tickAnim - 8) / 2) * (21.97399-(19.4925)));
            yy = 3.13992 + (((tickAnim - 8) / 2) * (0.57076-(3.13992)));
            zz = -25.65872 + (((tickAnim - 8) / 2) * (-25.71897-(-25.65872)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.175 + (((tickAnim - 0) / 2) * (1.26-(0.175)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.59-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 1.26 + (((tickAnim - 2) / 1) * (0.51-(1.26)));
            zz = 0.59 + (((tickAnim - 2) / 1) * (0.6-(0.59)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.51 + (((tickAnim - 3) / 1) * (0.35-(0.51)));
            zz = 0.6 + (((tickAnim - 3) / 1) * (0.2-(0.6)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0.35 + (((tickAnim - 4) / 1) * (-0.025-(0.35)));
            zz = 0.2 + (((tickAnim - 4) / 1) * (0-(0.2)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = -0.025 + (((tickAnim - 5) / 1) * (0.445-(-0.025)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0.445 + (((tickAnim - 6) / 1) * (0.365-(0.445)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.365 + (((tickAnim - 7) / 1) * (0-(0.365)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0.175-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righthand.rotationPointX = this.righthand.rotationPointX + (float)(xx);
        this.righthand.rotationPointY = this.righthand.rotationPointY - (float)(yy);
        this.righthand.rotationPointZ = this.righthand.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-50))*4), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*12), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-50))*-4), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+150))*10), head.rotateAngleZ + (float) Math.toRadians(0));
    }
    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPetrolacosaurus entity = (EntityPrehistoricFloraPetrolacosaurus) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-90))*2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-50))*0.2);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-150))*-0.3);



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 80.60563 + (((tickAnim - 0) / 6) * (41.7766-(80.60563)));
            yy = 30.81336 + (((tickAnim - 0) / 6) * (34.50802-(30.81336)));
            zz = -51.17396 + (((tickAnim - 0) / 6) * (-71.02225-(-51.17396)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 41.7766 + (((tickAnim - 6) / 7) * (-18.34367-(41.7766)));
            yy = 34.50802 + (((tickAnim - 6) / 7) * (17.75798-(34.50802)));
            zz = -71.02225 + (((tickAnim - 6) / 7) * (21.67606-(-71.02225)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -18.34367 + (((tickAnim - 13) / 12) * (80.60563-(-18.34367)));
            yy = 17.75798 + (((tickAnim - 13) / 12) * (30.81336-(17.75798)));
            zz = 21.67606 + (((tickAnim - 13) / 12) * (-51.17396-(21.67606)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (10.65773-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.05465-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (4.74969-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 10.65773 + (((tickAnim - 3) / 6) * (-39.76-(10.65773)));
            yy = -0.05465 + (((tickAnim - 3) / 6) * (0-(-0.05465)));
            zz = 4.74969 + (((tickAnim - 3) / 6) * (0-(4.74969)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -39.76 + (((tickAnim - 9) / 4) * (-21.5-(-39.76)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -21.5 + (((tickAnim - 13) / 12) * (0-(-21.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 6.47285 + (((tickAnim - 0) / 4) * (78.40352-(6.47285)));
            yy = -11.04327 + (((tickAnim - 0) / 4) * (-13.64197-(-11.04327)));
            zz = 39.7645 + (((tickAnim - 0) / 4) * (-8.13925-(39.7645)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 78.40352 + (((tickAnim - 4) / 5) * (22.34321-(78.40352)));
            yy = -13.64197 + (((tickAnim - 4) / 5) * (-11.41491-(-13.64197)));
            zz = -8.13925 + (((tickAnim - 4) / 5) * (47.82759-(-8.13925)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 22.34321 + (((tickAnim - 9) / 4) * (20.68275-(22.34321)));
            yy = -11.41491 + (((tickAnim - 9) / 4) * (-4.27796-(-11.41491)));
            zz = 47.82759 + (((tickAnim - 9) / 4) * (-12.59037-(47.82759)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 20.68275 + (((tickAnim - 13) / 5) * (-9.63254-(20.68275)));
            yy = -4.27796 + (((tickAnim - 13) / 5) * (-6.31267-(-4.27796)));
            zz = -12.59037 + (((tickAnim - 13) / 5) * (18.80153-(-12.59037)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -9.63254 + (((tickAnim - 18) / 4) * (-9.32984-(-9.63254)));
            yy = -6.31267 + (((tickAnim - 18) / 4) * (-8.67797-(-6.31267)));
            zz = 18.80153 + (((tickAnim - 18) / 4) * (29.28301-(18.80153)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -9.32984 + (((tickAnim - 22) / 3) * (6.47285-(-9.32984)));
            yy = -8.67797 + (((tickAnim - 22) / 3) * (-11.04327-(-8.67797)));
            zz = 29.28301 + (((tickAnim - 22) / 3) * (39.7645-(29.28301)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0.475-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (1.775-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0.475 + (((tickAnim - 4) / 5) * (0-(0.475)));
            yy = 1.775 + (((tickAnim - 4) / 5) * (0-(1.775)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0.3-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0.3 + (((tickAnim - 13) / 1) * (0.66-(0.3)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = 0.66 + (((tickAnim - 14) / 1) * (0.85-(0.66)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 0.85 + (((tickAnim - 15) / 2) * (1-(0.85)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 1 + (((tickAnim - 17) / 1) * (0.775-(1)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.775 + (((tickAnim - 18) / 2) * (0.825-(0.775)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0.825 + (((tickAnim - 20) / 5) * (0-(0.825)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -18.34367 + (((tickAnim - 0) / 6) * (31.80894-(-18.34367)));
            yy = -17.75798 + (((tickAnim - 0) / 6) * (-14.15936-(-17.75798)));
            zz = -21.67606 + (((tickAnim - 0) / 6) * (23.58694-(-21.67606)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 31.80894 + (((tickAnim - 6) / 7) * (80.60563-(31.80894)));
            yy = -14.15936 + (((tickAnim - 6) / 7) * (-30.81336-(-14.15936)));
            zz = 23.58694 + (((tickAnim - 6) / 7) * (51.17396-(23.58694)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 80.60563 + (((tickAnim - 13) / 5) * (41.7766-(80.60563)));
            yy = -30.81336 + (((tickAnim - 13) / 5) * (-34.50802-(-30.81336)));
            zz = 51.17396 + (((tickAnim - 13) / 5) * (71.02225-(51.17396)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 41.7766 + (((tickAnim - 18) / 7) * (-18.34367-(41.7766)));
            yy = -34.50802 + (((tickAnim - 18) / 7) * (-17.75798-(-34.50802)));
            zz = 71.02225 + (((tickAnim - 18) / 7) * (-21.67606-(71.02225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -21.5 + (((tickAnim - 0) / 13) * (0-(-21.5)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (10.65773-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (-0.05465-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (4.74969-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 10.65773 + (((tickAnim - 15) / 7) * (-39.76-(10.65773)));
            yy = -0.05465 + (((tickAnim - 15) / 7) * (0-(-0.05465)));
            zz = 4.74969 + (((tickAnim - 15) / 7) * (0-(4.74969)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -39.76 + (((tickAnim - 22) / 3) * (-21.5-(-39.76)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 20.68275 + (((tickAnim - 0) / 6) * (-1.88254-(20.68275)));
            yy = 4.27796 + (((tickAnim - 0) / 6) * (6.31267-(4.27796)));
            zz = 12.59037 + (((tickAnim - 0) / 6) * (-18.80153-(12.59037)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -1.88254 + (((tickAnim - 6) / 3) * (-6.32984-(-1.88254)));
            yy = 6.31267 + (((tickAnim - 6) / 3) * (8.67797-(6.31267)));
            zz = -18.80153 + (((tickAnim - 6) / 3) * (-29.28301-(-18.80153)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -6.32984 + (((tickAnim - 9) / 4) * (6.47285-(-6.32984)));
            yy = 8.67797 + (((tickAnim - 9) / 4) * (11.04327-(8.67797)));
            zz = -29.28301 + (((tickAnim - 9) / 4) * (-39.7645-(-29.28301)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 6.47285 + (((tickAnim - 13) / 4) * (78.40352-(6.47285)));
            yy = 11.04327 + (((tickAnim - 13) / 4) * (13.64197-(11.04327)));
            zz = -39.7645 + (((tickAnim - 13) / 4) * (8.13925-(-39.7645)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 78.40352 + (((tickAnim - 17) / 5) * (22.34321-(78.40352)));
            yy = 13.64197 + (((tickAnim - 17) / 5) * (11.41491-(13.64197)));
            zz = 8.13925 + (((tickAnim - 17) / 5) * (-47.82759-(8.13925)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 22.34321 + (((tickAnim - 22) / 3) * (20.68275-(22.34321)));
            yy = 11.41491 + (((tickAnim - 22) / 3) * (4.27796-(11.41491)));
            zz = -47.82759 + (((tickAnim - 22) / 3) * (12.59037-(-47.82759)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.275 + (((tickAnim - 0) / 2) * (0.67-(0.275)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.67 + (((tickAnim - 2) / 1) * (0.75-(0.67)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.75 + (((tickAnim - 3) / 1) * (0.725-(0.75)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0.725 + (((tickAnim - 4) / 2) * (0.125-(0.725)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.125 + (((tickAnim - 6) / 2) * (0.15-(0.125)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.15 + (((tickAnim - 8) / 5) * (0-(0.15)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (1.475-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            yy = 1.475 + (((tickAnim - 17) / 5) * (0-(1.475)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 3) * (0.275-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*-5), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-90))*-2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*-7), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-90))*-2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*-9), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-90))*-2));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-80))*-6), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+50))*-8), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-90))*-2));



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (23.68487-(0)));
            yy = 52.75 + (((tickAnim - 0) / 13) * (-36.98288-(52.75)));
            zz = 0 + (((tickAnim - 0) / 13) * (-8.26544-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 23.68487 + (((tickAnim - 13) / 5) * (-14.20756-(23.68487)));
            yy = -36.98288 + (((tickAnim - 13) / 5) * (5.72442-(-36.98288)));
            zz = -8.26544 + (((tickAnim - 13) / 5) * (-26.6295-(-8.26544)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -14.20756 + (((tickAnim - 18) / 7) * (0-(-14.20756)));
            yy = 5.72442 + (((tickAnim - 18) / 7) * (52.75-(5.72442)));
            zz = -26.6295 + (((tickAnim - 18) / 7) * (0-(-26.6295)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -13.25 + (((tickAnim - 0) / 13) * (0-(-13.25)));
            yy = -19.5 + (((tickAnim - 0) / 13) * (0-(-19.5)));
            zz = -25.75 + (((tickAnim - 0) / 13) * (-20.75-(-25.75)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (12.1222-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (-2.7256-(0)));
            zz = -20.75 + (((tickAnim - 13) / 3) * (-32.30097-(-20.75)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 12.1222 + (((tickAnim - 16) / 3) * (-25.125-(12.1222)));
            yy = -2.7256 + (((tickAnim - 16) / 3) * (-9.75-(-2.7256)));
            zz = -32.30097 + (((tickAnim - 16) / 3) * (-23.25-(-32.30097)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -25.125 + (((tickAnim - 19) / 6) * (-13.25-(-25.125)));
            yy = -9.75 + (((tickAnim - 19) / 6) * (-19.5-(-9.75)));
            zz = -23.25 + (((tickAnim - 19) / 6) * (-25.75-(-23.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -0.275 + (((tickAnim - 0) / 13) * (0-(-0.275)));
            zz = -0.15 + (((tickAnim - 0) / 13) * (0-(-0.15)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (-0.15-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm2.rotationPointX = this.leftarm2.rotationPointX + (float)(xx);
        this.leftarm2.rotationPointY = this.leftarm2.rotationPointY - (float)(yy);
        this.leftarm2.rotationPointZ = this.leftarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 15.70789 + (((tickAnim - 0) / 6) * (0.4925-(15.70789)));
            yy = -1.76941 + (((tickAnim - 0) / 6) * (-3.13992-(-1.76941)));
            zz = 13.72655 + (((tickAnim - 0) / 6) * (25.65872-(13.72655)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0.4925 + (((tickAnim - 6) / 7) * (-8.77601-(0.4925)));
            yy = -3.13992 + (((tickAnim - 6) / 7) * (-0.57076-(-3.13992)));
            zz = 25.65872 + (((tickAnim - 6) / 7) * (25.71897-(25.65872)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -8.77601 + (((tickAnim - 13) / 5) * (104.46594-(-8.77601)));
            yy = -0.57076 + (((tickAnim - 13) / 5) * (-1.17009-(-0.57076)));
            zz = 25.71897 + (((tickAnim - 13) / 5) * (19.72276-(25.71897)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 104.46594 + (((tickAnim - 18) / 7) * (15.70789-(104.46594)));
            yy = -1.17009 + (((tickAnim - 18) / 7) * (-1.76941-(-1.17009)));
            zz = 19.72276 + (((tickAnim - 18) / 7) * (13.72655-(19.72276)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -0.175 + (((tickAnim - 0) / 13) * (0.1-(-0.175)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.1 + (((tickAnim - 13) / 2) * (0.66-(0.1)));
            zz = 0 + (((tickAnim - 13) / 2) * (0.2-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0.66 + (((tickAnim - 15) / 3) * (0.41-(0.66)));
            zz = 0.2 + (((tickAnim - 15) / 3) * (0.6-(0.2)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0.41 + (((tickAnim - 18) / 5) * (0.395-(0.41)));
            zz = 0.6 + (((tickAnim - 18) / 5) * (0.3-(0.6)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0.395 + (((tickAnim - 23) / 2) * (-0.175-(0.395)));
            zz = 0.3 + (((tickAnim - 23) / 2) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefthand.rotationPointX = this.lefthand.rotationPointX + (float)(xx);
        this.lefthand.rotationPointY = this.lefthand.rotationPointY - (float)(yy);
        this.lefthand.rotationPointZ = this.lefthand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 23.68487 + (((tickAnim - 0) / 6) * (-14.20756-(23.68487)));
            yy = 36.98288 + (((tickAnim - 0) / 6) * (-5.72442-(36.98288)));
            zz = 8.26544 + (((tickAnim - 0) / 6) * (26.6295-(8.26544)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -14.20756 + (((tickAnim - 6) / 7) * (0-(-14.20756)));
            yy = -5.72442 + (((tickAnim - 6) / 7) * (-52.75-(-5.72442)));
            zz = 26.6295 + (((tickAnim - 6) / 7) * (0-(26.6295)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (23.68487-(0)));
            yy = -52.75 + (((tickAnim - 13) / 12) * (36.98288-(-52.75)));
            zz = 0 + (((tickAnim - 13) / 12) * (8.26544-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (12.1222-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (2.7256-(0)));
            zz = 20.75 + (((tickAnim - 0) / 3) * (32.30097-(20.75)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 12.1222 + (((tickAnim - 3) / 5) * (-25.125-(12.1222)));
            yy = 2.7256 + (((tickAnim - 3) / 5) * (9.75-(2.7256)));
            zz = 32.30097 + (((tickAnim - 3) / 5) * (23.25-(32.30097)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -25.125 + (((tickAnim - 8) / 5) * (-13.25-(-25.125)));
            yy = 9.75 + (((tickAnim - 8) / 5) * (19.5-(9.75)));
            zz = 23.25 + (((tickAnim - 8) / 5) * (25.75-(23.25)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -13.25 + (((tickAnim - 13) / 12) * (0-(-13.25)));
            yy = 19.5 + (((tickAnim - 13) / 12) * (0-(19.5)));
            zz = 25.75 + (((tickAnim - 13) / 12) * (20.75-(25.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.15-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = -0.275 + (((tickAnim - 13) / 12) * (0-(-0.275)));
            zz = -0.15 + (((tickAnim - 13) / 12) * (0-(-0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm2.rotationPointX = this.rightarm2.rotationPointX + (float)(xx);
        this.rightarm2.rotationPointY = this.rightarm2.rotationPointY - (float)(yy);
        this.rightarm2.rotationPointZ = this.rightarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -8.77601 + (((tickAnim - 0) / 3) * (71.67595-(-8.77601)));
            yy = 0.57076 + (((tickAnim - 0) / 3) * (0.80277-(0.57076)));
            zz = -25.71897 + (((tickAnim - 0) / 3) * (-23.3977-(-25.71897)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 71.67595 + (((tickAnim - 3) / 5) * (80.55341-(71.67595)));
            yy = 0.80277 + (((tickAnim - 3) / 5) * (1.09279-(0.80277)));
            zz = -23.3977 + (((tickAnim - 3) / 5) * (-20.49612-(-23.3977)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 80.55341 + (((tickAnim - 8) / 5) * (15.70789-(80.55341)));
            yy = 1.09279 + (((tickAnim - 8) / 5) * (1.76941-(1.09279)));
            zz = -20.49612 + (((tickAnim - 8) / 5) * (-13.72655-(-20.49612)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 15.70789 + (((tickAnim - 13) / 5) * (-0.96649-(15.70789)));
            yy = 1.76941 + (((tickAnim - 13) / 5) * (2.57439-(1.76941)));
            zz = -13.72655 + (((tickAnim - 13) / 5) * (-25.30176-(-13.72655)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -0.96649 + (((tickAnim - 18) / 7) * (-8.77601-(-0.96649)));
            yy = 2.57439 + (((tickAnim - 18) / 7) * (0.57076-(2.57439)));
            zz = -25.30176 + (((tickAnim - 18) / 7) * (-25.71897-(-25.30176)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.175 + (((tickAnim - 0) / 3) * (1.26-(0.175)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.24-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 1.26 + (((tickAnim - 3) / 5) * (0.51-(1.26)));
            zz = 0.24 + (((tickAnim - 3) / 5) * (0.6-(0.24)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0.51 + (((tickAnim - 8) / 3) * (0.35-(0.51)));
            zz = 0.6 + (((tickAnim - 8) / 3) * (0.2-(0.6)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.35 + (((tickAnim - 11) / 2) * (0.15-(0.35)));
            zz = 0.2 + (((tickAnim - 11) / 2) * (0-(0.2)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0.15 + (((tickAnim - 13) / 12) * (0.175-(0.15)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righthand.rotationPointX = this.righthand.rotationPointX + (float)(xx);
        this.righthand.rotationPointY = this.righthand.rotationPointY - (float)(yy);
        this.righthand.rotationPointZ = this.righthand.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*8), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+150))*6), head.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animClimb(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraPetrolacosaurus entity = (EntityPrehistoricFloraPetrolacosaurus) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = 0;
        if (!isStatic) {
            tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        }
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(-90.25), hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*5), hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-90))*2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(8+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-50))*0.2);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(-10.025+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-100))*0.3);



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 80.60563 + (((tickAnim - 0) / 6) * (41.7766-(80.60563)));
            yy = 30.81336 + (((tickAnim - 0) / 6) * (34.50802-(30.81336)));
            zz = -51.17396 + (((tickAnim - 0) / 6) * (-71.02225-(-51.17396)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 41.7766 + (((tickAnim - 6) / 7) * (-36.09367-(41.7766)));
            yy = 34.50802 + (((tickAnim - 6) / 7) * (17.75798-(34.50802)));
            zz = -71.02225 + (((tickAnim - 6) / 7) * (21.67606-(-71.02225)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -36.09367 + (((tickAnim - 13) / 12) * (80.60563-(-36.09367)));
            yy = 17.75798 + (((tickAnim - 13) / 12) * (30.81336-(17.75798)));
            zz = 21.67606 + (((tickAnim - 13) / 12) * (-51.17396-(21.67606)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (10.65773-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.05465-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (4.74969-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 10.65773 + (((tickAnim - 3) / 6) * (-39.76-(10.65773)));
            yy = -0.05465 + (((tickAnim - 3) / 6) * (0-(-0.05465)));
            zz = 4.74969 + (((tickAnim - 3) / 6) * (0-(4.74969)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -39.76 + (((tickAnim - 9) / 4) * (-21.5-(-39.76)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -21.5 + (((tickAnim - 13) / 12) * (0-(-21.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -6.25568 + (((tickAnim - 0) / 4) * (78.40352-(-6.25568)));
            yy = -10.17217 + (((tickAnim - 0) / 4) * (-13.64197-(-10.17217)));
            zz = 49.13396 + (((tickAnim - 0) / 4) * (-8.13925-(49.13396)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 78.40352 + (((tickAnim - 4) / 5) * (22.34321-(78.40352)));
            yy = -13.64197 + (((tickAnim - 4) / 5) * (-11.41491-(-13.64197)));
            zz = -8.13925 + (((tickAnim - 4) / 5) * (47.82759-(-8.13925)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 22.34321 + (((tickAnim - 9) / 4) * (39.62012-(22.34321)));
            yy = -11.41491 + (((tickAnim - 9) / 4) * (-0.77596-(-11.41491)));
            zz = 47.82759 + (((tickAnim - 9) / 4) * (-16.83616-(47.82759)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 39.62012 + (((tickAnim - 13) / 5) * (-9.63254-(39.62012)));
            yy = -0.77596 + (((tickAnim - 13) / 5) * (-6.31267-(-0.77596)));
            zz = -16.83616 + (((tickAnim - 13) / 5) * (18.80153-(-16.83616)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -9.63254 + (((tickAnim - 18) / 4) * (-9.32984-(-9.63254)));
            yy = -6.31267 + (((tickAnim - 18) / 4) * (-8.67797-(-6.31267)));
            zz = 18.80153 + (((tickAnim - 18) / 4) * (29.28301-(18.80153)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -9.32984 + (((tickAnim - 22) / 3) * (-6.25568-(-9.32984)));
            yy = -8.67797 + (((tickAnim - 22) / 3) * (-10.17217-(-8.67797)));
            zz = 29.28301 + (((tickAnim - 22) / 3) * (49.13396-(29.28301)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0.475-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (1.775-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0.475 + (((tickAnim - 4) / 5) * (0-(0.475)));
            yy = 1.775 + (((tickAnim - 4) / 5) * (0-(1.775)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0.4-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0.4 + (((tickAnim - 13) / 1) * (0.91-(0.4)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 0.91 + (((tickAnim - 14) / 3) * (1-(0.91)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 1 + (((tickAnim - 17) / 1) * (0.775-(1)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.775 + (((tickAnim - 18) / 2) * (0.825-(0.775)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = 0.825 + (((tickAnim - 20) / 2) * (0.875-(0.825)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0.875 + (((tickAnim - 22) / 3) * (0-(0.875)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -36.09367 + (((tickAnim - 0) / 6) * (42.91225-(-36.09367)));
            yy = -17.75798 + (((tickAnim - 0) / 6) * (-12.3331-(-17.75798)));
            zz = -21.67606 + (((tickAnim - 0) / 6) * (36.78971-(-21.67606)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 42.91225 + (((tickAnim - 6) / 7) * (80.60563-(42.91225)));
            yy = -12.3331 + (((tickAnim - 6) / 7) * (-30.81336-(-12.3331)));
            zz = 36.78971 + (((tickAnim - 6) / 7) * (51.17396-(36.78971)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 80.60563 + (((tickAnim - 13) / 5) * (41.7766-(80.60563)));
            yy = -30.81336 + (((tickAnim - 13) / 5) * (-34.50802-(-30.81336)));
            zz = 51.17396 + (((tickAnim - 13) / 5) * (71.02225-(51.17396)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 41.7766 + (((tickAnim - 18) / 7) * (-36.09367-(41.7766)));
            yy = -34.50802 + (((tickAnim - 18) / 7) * (-17.75798-(-34.50802)));
            zz = 71.02225 + (((tickAnim - 18) / 7) * (-21.67606-(71.02225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -21.5 + (((tickAnim - 0) / 6) * (-10.59159-(-21.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (3.67697-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (9.53208-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -10.59159 + (((tickAnim - 6) / 7) * (0-(-10.59159)));
            yy = 3.67697 + (((tickAnim - 6) / 7) * (0-(3.67697)));
            zz = 9.53208 + (((tickAnim - 6) / 7) * (0-(9.53208)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (10.65773-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (-0.05465-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (4.74969-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 10.65773 + (((tickAnim - 15) / 7) * (-39.76-(10.65773)));
            yy = -0.05465 + (((tickAnim - 15) / 7) * (0-(-0.05465)));
            zz = 4.74969 + (((tickAnim - 15) / 7) * (0-(4.74969)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -39.76 + (((tickAnim - 22) / 3) * (-21.5-(-39.76)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 37.36249 + (((tickAnim - 0) / 3) * (13.93775-(37.36249)));
            yy = 14.97959 + (((tickAnim - 0) / 3) * (16.71261-(14.97959)));
            zz = 32.32198 + (((tickAnim - 0) / 3) * (-8.17283-(32.32198)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 13.93775 + (((tickAnim - 3) / 3) * (9.40821-(13.93775)));
            yy = 16.71261 + (((tickAnim - 3) / 3) * (6.91989-(16.71261)));
            zz = -8.17283 + (((tickAnim - 3) / 3) * (-34.12824-(-8.17283)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 9.40821 + (((tickAnim - 6) / 3) * (-6.32984-(9.40821)));
            yy = 6.91989 + (((tickAnim - 6) / 3) * (8.67797-(6.91989)));
            zz = -34.12824 + (((tickAnim - 6) / 3) * (-29.28301-(-34.12824)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -6.32984 + (((tickAnim - 9) / 4) * (6.47285-(-6.32984)));
            yy = 8.67797 + (((tickAnim - 9) / 4) * (11.04327-(8.67797)));
            zz = -29.28301 + (((tickAnim - 9) / 4) * (-39.7645-(-29.28301)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 6.47285 + (((tickAnim - 13) / 4) * (78.40352-(6.47285)));
            yy = 11.04327 + (((tickAnim - 13) / 4) * (13.64197-(11.04327)));
            zz = -39.7645 + (((tickAnim - 13) / 4) * (8.13925-(-39.7645)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 78.40352 + (((tickAnim - 17) / 5) * (22.34321-(78.40352)));
            yy = 13.64197 + (((tickAnim - 17) / 5) * (11.41491-(13.64197)));
            zz = 8.13925 + (((tickAnim - 17) / 5) * (-47.82759-(8.13925)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 22.34321 + (((tickAnim - 22) / 3) * (37.36249-(22.34321)));
            yy = 11.41491 + (((tickAnim - 22) / 3) * (14.97959-(11.41491)));
            zz = -47.82759 + (((tickAnim - 22) / 3) * (32.32198-(-47.82759)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.275 + (((tickAnim - 0) / 2) * (0.91-(0.275)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.91 + (((tickAnim - 2) / 1) * (0.925-(0.91)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.925 + (((tickAnim - 3) / 1) * (0.725-(0.925)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0.725 + (((tickAnim - 4) / 2) * (0.125-(0.725)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.125 + (((tickAnim - 6) / 2) * (0.15-(0.125)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.15 + (((tickAnim - 8) / 5) * (0-(0.15)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (1.475-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            yy = 1.475 + (((tickAnim - 17) / 5) * (0-(1.475)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 3) * (0.275-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*-5), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-90))*-2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*-7), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-90))*-2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*-9), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-90))*-2));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-80))*-1), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+50))*-8), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-90))*-2));



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -10.51999 + (((tickAnim - 0) / 6) * (5.86167-(-10.51999)));
            yy = 43.44741 + (((tickAnim - 0) / 6) * (8.6017-(43.44741)));
            zz = -22.04883 + (((tickAnim - 0) / 6) * (-8.01225-(-22.04883)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 5.86167 + (((tickAnim - 6) / 7) * (29.74896-(5.86167)));
            yy = 8.6017 + (((tickAnim - 6) / 7) * (-36.51418-(8.6017)));
            zz = -8.01225 + (((tickAnim - 6) / 7) * (-15.51381-(-8.01225)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 29.74896 + (((tickAnim - 13) / 5) * (-12.64336-(29.74896)));
            yy = -36.51418 + (((tickAnim - 13) / 5) * (2.14087-(-36.51418)));
            zz = -15.51381 + (((tickAnim - 13) / 5) * (-32.2742-(-15.51381)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -12.64336 + (((tickAnim - 18) / 7) * (-10.51999-(-12.64336)));
            yy = 2.14087 + (((tickAnim - 18) / 7) * (43.44741-(2.14087)));
            zz = -32.2742 + (((tickAnim - 18) / 7) * (-22.04883-(-32.2742)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -13.25 + (((tickAnim - 0) / 13) * (0-(-13.25)));
            yy = -19.5 + (((tickAnim - 0) / 13) * (0-(-19.5)));
            zz = -25.75 + (((tickAnim - 0) / 13) * (-45.25-(-25.75)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (12.1222-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (-2.7256-(0)));
            zz = -45.25 + (((tickAnim - 13) / 3) * (-32.30097-(-45.25)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 12.1222 + (((tickAnim - 16) / 3) * (-48.59485-(12.1222)));
            yy = -2.7256 + (((tickAnim - 16) / 3) * (-17.59332-(-2.7256)));
            zz = -32.30097 + (((tickAnim - 16) / 3) * (-42.20674-(-32.30097)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -48.59485 + (((tickAnim - 19) / 6) * (-13.25-(-48.59485)));
            yy = -17.59332 + (((tickAnim - 19) / 6) * (-19.5-(-17.59332)));
            zz = -42.20674 + (((tickAnim - 19) / 6) * (-25.75-(-42.20674)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -0.275 + (((tickAnim - 0) / 13) * (0-(-0.275)));
            zz = -0.15 + (((tickAnim - 0) / 13) * (0-(-0.15)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (-0.15-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm2.rotationPointX = this.leftarm2.rotationPointX + (float)(xx);
        this.leftarm2.rotationPointY = this.leftarm2.rotationPointY - (float)(yy);
        this.leftarm2.rotationPointZ = this.leftarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 29.08139 + (((tickAnim - 0) / 6) * (-0.59994-(29.08139)));
            yy = -11.98744 + (((tickAnim - 0) / 6) * (-6.57171-(-11.98744)));
            zz = 28.50849 + (((tickAnim - 0) / 6) * (38.50484-(28.50849)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -0.59994 + (((tickAnim - 6) / 7) * (-9.67946-(-0.59994)));
            yy = -6.57171 + (((tickAnim - 6) / 7) * (-3.28412-(-6.57171)));
            zz = 38.50484 + (((tickAnim - 6) / 7) * (52.09737-(38.50484)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -9.67946 + (((tickAnim - 13) / 5) * (104.46594-(-9.67946)));
            yy = -3.28412 + (((tickAnim - 13) / 5) * (-1.17009-(-3.28412)));
            zz = 52.09737 + (((tickAnim - 13) / 5) * (19.72276-(52.09737)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 104.46594 + (((tickAnim - 18) / 7) * (29.08139-(104.46594)));
            yy = -1.17009 + (((tickAnim - 18) / 7) * (-11.98744-(-1.17009)));
            zz = 19.72276 + (((tickAnim - 18) / 7) * (28.50849-(19.72276)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -0.175 + (((tickAnim - 0) / 13) * (0.1-(-0.175)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.1 + (((tickAnim - 13) / 2) * (0.66-(0.1)));
            zz = 0 + (((tickAnim - 13) / 2) * (0.2-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0.66 + (((tickAnim - 15) / 3) * (0.41-(0.66)));
            zz = 0.2 + (((tickAnim - 15) / 3) * (0.6-(0.2)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0.41 + (((tickAnim - 18) / 5) * (0.395-(0.41)));
            zz = 0.6 + (((tickAnim - 18) / 5) * (0.3-(0.6)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0.395 + (((tickAnim - 23) / 2) * (-0.175-(0.395)));
            zz = 0.3 + (((tickAnim - 23) / 2) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefthand.rotationPointX = this.lefthand.rotationPointX + (float)(xx);
        this.lefthand.rotationPointY = this.lefthand.rotationPointY - (float)(yy);
        this.lefthand.rotationPointZ = this.lefthand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 29.74896 + (((tickAnim - 0) / 6) * (-12.64336-(29.74896)));
            yy = 36.51418 + (((tickAnim - 0) / 6) * (-2.14087-(36.51418)));
            zz = 15.51381 + (((tickAnim - 0) / 6) * (32.2742-(15.51381)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -12.64336 + (((tickAnim - 6) / 7) * (-8.73136-(-12.64336)));
            yy = -2.14087 + (((tickAnim - 6) / 7) * (-45.67304-(-2.14087)));
            zz = 32.2742 + (((tickAnim - 6) / 7) * (17.74807-(32.2742)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -8.73136 + (((tickAnim - 13) / 12) * (29.74896-(-8.73136)));
            yy = -45.67304 + (((tickAnim - 13) / 12) * (36.51418-(-45.67304)));
            zz = 17.74807 + (((tickAnim - 13) / 12) * (15.51381-(17.74807)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (12.1222-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (2.7256-(0)));
            zz = 45.25 + (((tickAnim - 0) / 3) * (32.30097-(45.25)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 12.1222 + (((tickAnim - 3) / 5) * (-19.59392-(12.1222)));
            yy = 2.7256 + (((tickAnim - 3) / 5) * (18.71022-(2.7256)));
            zz = 32.30097 + (((tickAnim - 3) / 5) * (45.41874-(32.30097)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -19.59392 + (((tickAnim - 8) / 5) * (-13.25-(-19.59392)));
            yy = 18.71022 + (((tickAnim - 8) / 5) * (19.5-(18.71022)));
            zz = 45.41874 + (((tickAnim - 8) / 5) * (25.75-(45.41874)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -13.25 + (((tickAnim - 13) / 12) * (0-(-13.25)));
            yy = 19.5 + (((tickAnim - 13) / 12) * (0-(19.5)));
            zz = 25.75 + (((tickAnim - 13) / 12) * (45.25-(25.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.15-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = -0.275 + (((tickAnim - 13) / 12) * (0-(-0.275)));
            zz = -0.15 + (((tickAnim - 13) / 12) * (0-(-0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm2.rotationPointX = this.rightarm2.rotationPointX + (float)(xx);
        this.rightarm2.rotationPointY = this.rightarm2.rotationPointY - (float)(yy);
        this.rightarm2.rotationPointZ = this.rightarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -8.77601 + (((tickAnim - 0) / 3) * (71.67595-(-8.77601)));
            yy = 0.57076 + (((tickAnim - 0) / 3) * (0.80277-(0.57076)));
            zz = -25.71897 + (((tickAnim - 0) / 3) * (-23.3977-(-25.71897)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 71.67595 + (((tickAnim - 3) / 5) * (80.55341-(71.67595)));
            yy = 0.80277 + (((tickAnim - 3) / 5) * (1.09279-(0.80277)));
            zz = -23.3977 + (((tickAnim - 3) / 5) * (-20.49612-(-23.3977)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 80.55341 + (((tickAnim - 8) / 5) * (29.44074-(80.55341)));
            yy = 1.09279 + (((tickAnim - 8) / 5) * (12.22455-(1.09279)));
            zz = -20.49612 + (((tickAnim - 8) / 5) * (-32.10347-(-20.49612)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 29.44074 + (((tickAnim - 13) / 5) * (-3.20282-(29.44074)));
            yy = 12.22455 + (((tickAnim - 13) / 5) * (8.07374-(12.22455)));
            zz = -32.10347 + (((tickAnim - 13) / 5) * (-49.03316-(-32.10347)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -3.20282 + (((tickAnim - 18) / 7) * (-8.77601-(-3.20282)));
            yy = 8.07374 + (((tickAnim - 18) / 7) * (0.57076-(8.07374)));
            zz = -49.03316 + (((tickAnim - 18) / 7) * (-25.71897-(-49.03316)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.175 + (((tickAnim - 0) / 3) * (1.785-(0.175)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.24-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 1.785 + (((tickAnim - 3) / 5) * (0.51-(1.785)));
            zz = 0.24 + (((tickAnim - 3) / 5) * (0.6-(0.24)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0.51 + (((tickAnim - 8) / 3) * (0.35-(0.51)));
            zz = 0.6 + (((tickAnim - 8) / 3) * (0.2-(0.6)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.35 + (((tickAnim - 11) / 2) * (0.15-(0.35)));
            zz = 0.2 + (((tickAnim - 11) / 2) * (0-(0.2)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0.15 + (((tickAnim - 13) / 12) * (0.175-(0.15)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righthand.rotationPointX = this.righthand.rotationPointX + (float)(xx);
        this.righthand.rotationPointY = this.righthand.rotationPointY - (float)(yy);
        this.righthand.rotationPointZ = this.righthand.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*8), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+150))*6), head.rotateAngleZ + (float) Math.toRadians(0));
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraPetrolacosaurus e = (EntityPrehistoricFloraPetrolacosaurus) entity;
        animator.update(entity);
        //this.resetToDefaultPose();

    }
}
