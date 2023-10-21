package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCriocephalosaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelCriocephalosaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended root;
    private final AdvancedModelRendererExtended hips;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended Rightthigh;
    private final AdvancedModelRendererExtended Rightshin;
    private final AdvancedModelRendererExtended Righthindfoot;
    private final AdvancedModelRendererExtended Leftthigh;
    private final AdvancedModelRendererExtended Leftshin;
    private final AdvancedModelRendererExtended Lefthindfoot;
    private final AdvancedModelRendererExtended tail1;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended chest;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended leftArm;
    private final AdvancedModelRendererExtended leftArm2;
    private final AdvancedModelRendererExtended leftArm3;
    private final AdvancedModelRendererExtended rightArm;
    private final AdvancedModelRendererExtended rightArm2;
    private final AdvancedModelRendererExtended rightArm3;
    private final AdvancedModelRendererExtended neck1;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended neck2;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended jaw;
    private final AdvancedModelRendererExtended cube_r11;

    private ModelAnimator animator;

    public ModelCriocephalosaurus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.root = new AdvancedModelRendererExtended(this);
        this.root.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.hips = new AdvancedModelRendererExtended(this);
        this.hips.setRotationPoint(0.0F, -16.0F, 15.0F);
        this.root.addChild(hips);
        this.setRotateAngle(hips, -0.3491F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 49, 35, -6.0F, -5.8F, -1.0F, 12, 14, 10, 0.0F, false));

        this.Rightthigh = new AdvancedModelRendererExtended(this);
        this.Rightthigh.setRotationPoint(5.0F, 0.1819F, 0.1026F);
        this.hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, -0.0627F, -0.0111F, -0.5351F);
        this.Rightthigh.cubeList.add(new ModelBox(Rightthigh, 0, 79, -3.601F, 0.2893F, -3.1153F, 5, 8, 6, 0.0F, false));

        this.Rightshin = new AdvancedModelRendererExtended(this);
        this.Rightshin.setRotationPoint(-1.5352F, 8.3887F, -1.871F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 0.4636F, -0.0588F, 0.4991F);
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 87, 87, -1.787F, -0.8575F, -1.1401F, 4, 9, 5, 0.0F, false));

        this.Righthindfoot = new AdvancedModelRendererExtended(this);
        this.Righthindfoot.setRotationPoint(-0.0183F, 6.9984F, 1.947F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, -0.0424F, 0.0F, 0.0F);
        this.Righthindfoot.cubeList.add(new ModelBox(Righthindfoot, 85, 10, -2.2724F, 0.3476F, -5.083F, 5, 2, 7, 0.0F, false));

        this.Leftthigh = new AdvancedModelRendererExtended(this);
        this.Leftthigh.setRotationPoint(-5.0F, 0.1819F, 0.1026F);
        this.hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, -0.0627F, 0.0111F, 0.5351F);
        this.Leftthigh.cubeList.add(new ModelBox(Leftthigh, 0, 79, -1.399F, 0.2893F, -3.1153F, 5, 8, 6, 0.0F, true));

        this.Leftshin = new AdvancedModelRendererExtended(this);
        this.Leftshin.setRotationPoint(1.5352F, 8.3887F, -1.871F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 0.4636F, 0.0588F, -0.4991F);
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 87, 87, -2.213F, -0.8575F, -1.1401F, 4, 9, 5, 0.0F, true));

        this.Lefthindfoot = new AdvancedModelRendererExtended(this);
        this.Lefthindfoot.setRotationPoint(0.0183F, 6.9984F, 1.947F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, -0.0424F, 0.0F, 0.0F);
        this.Lefthindfoot.cubeList.add(new ModelBox(Lefthindfoot, 85, 10, -2.7276F, 0.3476F, -5.083F, 5, 2, 7, 0.0F, true));

        this.tail1 = new AdvancedModelRendererExtended(this);
        this.tail1.setRotationPoint(0.0F, -3.0F, 4.0F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.1745F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 61, 15, -4.0F, -2.0F, -1.0F, 8, 7, 7, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 1.0F, 6.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.3927F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 22, 71, -2.0F, -2.0F, -1.0F, 4, 4, 9, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1309F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 15, 86, -1.0F, -1.0F, -1.0F, 2, 2, 8, 0.0F, false));

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, -3.0F, -3.0F);
        this.hips.addChild(body);


        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -7.0F, -3.0F, -18.0F, 14, 18, 16, 0.0F, false));

        this.chest = new AdvancedModelRendererExtended(this);
        this.chest.setRotationPoint(0.0F, 0.0F, -18.0F);
        this.body.addChild(chest);


        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chest.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2182F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 35, -6.0F, -2.0F, -11.0F, 12, 18, 12, 0.0F, false));

        this.leftArm = new AdvancedModelRendererExtended(this);
        this.leftArm.setRotationPoint(6.0F, 13.0F, -3.0F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.0F, -0.6545F, 0.48F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 0, 66, -2.0F, -2.0F, -3.0F, 9, 6, 6, 0.0F, false));

        this.leftArm2 = new AdvancedModelRendererExtended(this);
        this.leftArm2.setRotationPoint(6.0F, 1.0F, 0.0F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.5236F, 0.0F, 1.0036F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 71, 0, -2.0F, -2.0F, -2.0F, 11, 4, 5, 0.0F, false));

        this.leftArm3 = new AdvancedModelRendererExtended(this);
        this.leftArm3.setRotationPoint(9.0F, 0.0F, 0.0F);
        this.leftArm2.addChild(leftArm3);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 41, 80, -0.5F, -3.0012F, -4.9985F, 2, 6, 8, 0.0F, false));

        this.rightArm = new AdvancedModelRendererExtended(this);
        this.rightArm.setRotationPoint(-6.0F, 13.0F, -3.0F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.0F, 0.6545F, -0.48F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 0, 66, -7.0F, -2.0F, -3.0F, 9, 6, 6, 0.0F, true));

        this.rightArm2 = new AdvancedModelRendererExtended(this);
        this.rightArm2.setRotationPoint(-6.0F, 1.0F, 0.0F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.5236F, 0.0F, -1.0036F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 71, 0, -9.0F, -2.0F, -2.0F, 11, 4, 5, 0.0F, true));

        this.rightArm3 = new AdvancedModelRendererExtended(this);
        this.rightArm3.setRotationPoint(-9.0F, 0.0F, 0.0F);
        this.rightArm2.addChild(rightArm3);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 41, 80, -1.5F, -3.0012F, -4.9985F, 2, 6, 8, 0.0F, true));

        this.neck1 = new AdvancedModelRendererExtended(this);
        this.neck1.setRotationPoint(0.0F, 3.0F, -10.0F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.1309F, 0.0F, 0.0F);


        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.0F, 7.2F, -4.8F);
        this.neck1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.5847F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 45, 0, -3.5F, -3.1682F, 0.1279F, 7, 3, 11, 0.0F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.neck1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2182F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 40, 60, -4.5F, -2.1F, -3.0F, 9, 10, 9, 0.0F, false));

        this.neck2 = new AdvancedModelRendererExtended(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.neck1.addChild(neck2);
        this.neck2.cubeList.add(new ModelBox(neck2, 77, 60, -3.5F, -2.6F, -4.0F, 7, 8, 5, -0.003F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.0F, 5.4F, -4.0F);
        this.neck2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.6109F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 54, 80, -2.5F, -2.0F, 0.0F, 5, 2, 3, 0.0F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.5F, -2.0F, -4.0F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.48F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 71, 74, -4.0F, -2.01F, -6.0F, 7, 6, 6, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 92, 74, -4.0F, 4.0F, -3.0F, 7, 2, 3, 0.003F, false));
        this.head.cubeList.add(new ModelBox(head, 62, 87, -3.5F, 2.0F, -10.0F, 6, 2, 6, 0.0F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.0F, 2.0F, -10.0F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.9163F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 10, -2.5F, 3.0F, 2.0F, 4, 1, 1, -0.005F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -2.5F, 2.0F, 1.0F, 4, 1, 3, -0.002F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(-0.5F, -2.1954F, -0.2812F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -2.0595F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 84, 30, -3.0F, -1.6046F, -2.6988F, 6, 4, 6, -0.002F, false));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(0.0F, -2.0F, -3.4F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.9512F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 94, 41, -3.5F, -3.9853F, -1.7018F, 6, 6, 4, 0.001F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(0.0F, 2.0F, -10.0F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.7941F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 37, 35, -2.5F, 0.0F, 0.0F, 4, 2, 6, 0.0F, false));

        this.jaw = new AdvancedModelRendererExtended(this);
        this.jaw.setRotationPoint(0.0F, 4.0F, -3.0F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 94, 52, -4.0F, 0.0F, -3.0F, 7, 2, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 92, 20, -3.5F, -3.0F, -1.0F, 6, 3, 4, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 94, -3.0F, 0.0F, -7.0F, 5, 2, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(0.0F, 2.0F, -3.0F);
        this.jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2618F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 5, -2.0F, -1.0F, 0.0F, 3, 1, 3, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void renderStaticWall(float f) {
        this.neck1.offsetY = -0.07F;
        this.neck1.offsetZ = -0.05F;
        this.neck1.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(tail3, 0.1309F, -0.1745F, 0.0F);
        this.setRotateAngle(tail2, -0.3927F, -0.1745F, 0.0F);
        this.setRotateAngle(tail1, -0.1745F, -0.0873F, 0.0F);
        this.setRotateAngle(Rightthigh, -0.0627F, -0.0111F, -0.5351F);
        this.setRotateAngle(Rightshin, 0.4636F, -0.0588F, 0.4991F);
        this.setRotateAngle(Righthindfoot, -0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(rightArm2, 0.5236F, 0.0F, -1.0036F);
        this.setRotateAngle(rightArm, 0.0F, 0.6545F, -0.48F);
        this.setRotateAngle(neck2, 0.1745F, 0.0873F, 0.0F);
        this.setRotateAngle(neck1, -0.0873F, 0.0873F, 0.0436F);
        this.setRotateAngle(Leftthigh, -0.0627F, 0.0111F, 0.5351F);
        this.setRotateAngle(Leftshin, 0.4636F, 0.0588F, -0.4991F);
        this.setRotateAngle(Lefthindfoot, -0.0424F, 0.0F, 0.0F);
        this.setRotateAngle(leftArm2, 0.5236F, 0.0F, 1.0036F);
        this.setRotateAngle(leftArm, 0.0F, -0.6545F, 0.48F);
        this.setRotateAngle(jaw, 0.5672F, 0.0F, 0.0F);
        this.setRotateAngle(hips, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.3491F, 0.0873F, 0.0436F);
        this.setRotateAngle(cube_r9, -0.9512F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -2.0595F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.9163F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, -0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, -0.5847F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, 0.7941F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(chest, 0.0F, 0.1745F, 0.0873F);
        this.setRotateAngle(body, 0.0F, 0.1745F, 0.0436F);
        this.root.offsetY = -0.155F;
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
        //this.resetToDefaultPose();
        this.root.offsetY = 0.0F;
        this.root.offsetZ = 0.3F;

        EntityPrehistoricFloraCriocephalosaurus Criocephalosaurus = (EntityPrehistoricFloraCriocephalosaurus) e;
        float masterSpeed = Criocephalosaurus.getTravelSpeed();

        this.faceTarget(f3, f4, 8, neck1);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRendererExtended[] tail = {this.tail1, this.tail2, this.tail3};

        // || (Criocephalosaurus.moveStrafing == 0 && Criocephalosaurus.moveVertical == 0 && Criocephalosaurus.moveForward == 0)

        if (Criocephalosaurus.getAnimation() == Criocephalosaurus.LAY_ANIMATION) {
            this.swing(neck1, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck1, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.walk(leftArm, 0.6F, 0.40F, true, 5, 0.30F, f2, 1F);
            this.walk(rightArm, 0.6F, 0.40F, true, 8, 0.30F, f2, 1F);
            this.walk(leftArm2, 0.6F, 0.25F, true, 6, 0F, f2, 1F);
            this.walk(rightArm2, 0.6F, 0.25F, true, 9, 0F, f2, 1F);
            this.walk(leftArm3, 0.6F, 0.30F, true, 2, -0.10F, f2, 1F);
            this.walk(rightArm3, 0.6F, 0.30F, true, 5, -0.10F, f2, 1F);
            return;
        }
        else {
            if (!Criocephalosaurus.isReallyInWater()) {
                if (f3 == 0.0F || !Criocephalosaurus.getIsMoving()) {
                    this.swing(neck1, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
                    this.walk(neck1, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
                    this.chainFlap(tail, (0.06F*0.9F), 0.10F, 0.10F, f2, 1F);
                    this.chainSwing(tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
                    return;
                }

                if (Criocephalosaurus.getIsFast()) { //Running


                } else { //Walking

                }
            } else {
                //Swimming pose:
                if (f3 == 0.0F) { //static in water
                    return;
                }
                //moving in water
                return;
            }
        }

//        //float speed = masterSpeed / 2.625F;
//        float speed = masterSpeed / 2.225F;
//        if (Criocephalosaurus.getIsFast()) {
//            speed = speed * 2;
//        }
//
//        this.leftArm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 1, f2, 1.5F);;
//        this.rightArm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 4, f2, 1.5F);;
//        this.Leftthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 4, f2, 1.5F);;
//        this.Rightthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 1, f2, 1.5F);;
//
//        this.flap(leftArm, speed, -0.2F, true, 4, 0.15F, f2, 1F);
//        this.flap(rightArm, speed, 0.2F, true, 7, -0.15F, f2, 1F);
//        this.flap(Leftthigh, speed, 0.1F, false, 7, -0.05F, f2, 1F);
//        this.flap(Rightthigh, speed, -0.1F, false, 4, 0.05F, f2, 1F);
//
//        this.walk(leftArm, speed, 0.40F, true, 5, 0.30F, f2, 1F);
//        this.walk(rightArm, speed, 0.40F, true, 8, 0.30F, f2, 1F);
//        this.walk(Leftthigh, speed, 0.30F, true, 8, 0F, f2, 1F);
//        this.walk(Rightthigh, speed, 0.30F, true, 5, 0F, f2, 1F);
//
//        this.walk(leftArm2, speed, 0.25F, true, 6, 0F, f2, 1F);
//        this.walk(rightArm2, speed, 0.25F, true, 9, 0F, f2, 1F);
//        this.walk(Leftshin, speed, 0.20F, true, 9, 0F, f2, 1F);
//        this.walk(Rightshin, speed, 0.20F, true, 6, 0F, f2, 1F);
//
//        this.flap(leftArm2, speed, 0.10F, true, 0, 0.05F, f2, 1F);
//        this.flap(rightArm2, speed, -0.10F, true, 3, -0.05F, f2, 1F);
//        this.flap(Leftshin, speed, -0.10F, false, 3, -0.05F, f2, 1F);
//        this.flap(Rightshin, speed, 0.10F, false, 0, 0.05F, f2, 1F);
//
//        this.walk(leftArm3, speed, 0.30F, true, 2, -0.10F, f2, 1F);
//        this.walk(rightArm3, speed, 0.30F, true, 5, -0.10F, f2, 1F);
//        this.walk(Lefthindfoot, speed, 0.25F, true, 5, -0.08F, f2, 1F);
//        this.walk(Righthindfoot, speed, 0.25F, true, 2, -0.08F, f2, 1F);
//
//        this.bobExtended(hips, speed * 2F, 0.2F, false, 2.5F,  f2, 1F);
//
//        this.flap(hips, speed, 0.12F, false, 5.0F,0.06F, f2, 1.0F);
//        this.flap(body, speed, -0.12F, false, 5.0F,-0.06F, f2, 1.0F);
//        this.flap(chest, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);
//
//        this.walk(chest, speed * 2, 0.05F, false, 2.5F,-0.01F, f2, 0.8F);
//
//        this.swing(neck1, speed, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
//        this.walk(neck1, speed * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
//        this.chainFlap(tail, (speed*0.6F), 0.20F, 0.2F, f2, 1F);
//        this.chainSwing(tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);
//
//        this.hips.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(2.2), false, 1.5F, f2, 1);

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraCriocephalosaurus ee = (EntityPrehistoricFloraCriocephalosaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            //moving in water
            //
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            //animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            //animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            //animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            //animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The idle noise/anim
            //animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCriocephalosaurus entity = (EntityPrehistoricFloraCriocephalosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (27.5-(0)));
            yy = 7.5 + (((tickAnim - 0) / 2) * (12.5-(7.5)));
            zz = 7.5 + (((tickAnim - 0) / 2) * (17.5-(7.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 27.5 + (((tickAnim - 2) / 2) * (37.5-(27.5)));
            yy = 12.5 + (((tickAnim - 2) / 2) * (7.5-(12.5)));
            zz = 17.5 + (((tickAnim - 2) / 2) * (17.5-(17.5)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 37.5 + (((tickAnim - 4) / 3) * (25-(37.5)));
            yy = 7.5 + (((tickAnim - 4) / 3) * (-7.5-(7.5)));
            zz = 17.5 + (((tickAnim - 4) / 3) * (2.5-(17.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 25 + (((tickAnim - 7) / 3) * (0-(25)));
            yy = -7.5 + (((tickAnim - 7) / 3) * (-7.5-(-7.5)));
            zz = 2.5 + (((tickAnim - 7) / 3) * (-10-(2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (-30-(0)));
            yy = -7.5 + (((tickAnim - 10) / 5) * (-20-(-7.5)));
            zz = -10 + (((tickAnim - 10) / 5) * (-5-(-10)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = -30 + (((tickAnim - 15) / 2) * (-25-(-30)));
            yy = -20 + (((tickAnim - 15) / 2) * (-20-(-20)));
            zz = -5 + (((tickAnim - 15) / 2) * (10-(-5)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -25 + (((tickAnim - 17) / 1) * (-15-(-25)));
            yy = -20 + (((tickAnim - 17) / 1) * (0-(-20)));
            zz = 10 + (((tickAnim - 17) / 1) * (5-(10)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -15 + (((tickAnim - 18) / 2) * (0-(-15)));
            yy = 0 + (((tickAnim - 18) / 2) * (7.5-(0)));
            zz = 5 + (((tickAnim - 18) / 2) * (7.5-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftthigh, Leftthigh.rotateAngleX + (float) Math.toRadians(xx), Leftthigh.rotateAngleY + (float) Math.toRadians(yy), Leftthigh.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = -0.25 + (((tickAnim - 0) / 1) * (0.25-(-0.25)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 0.25 + (((tickAnim - 1) / 1) * (0-(0.25)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 3) * (0.5-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 7) / 3) * (0.5-(0.5)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0.5 + (((tickAnim - 10) / 5) * (0.5-(0.5)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 15) / 2) * (0.5-(0.5)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 17) / 1) * (-0.25-(0.5)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = -0.25 + (((tickAnim - 18) / 1) * (0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.5-(-0.25)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            yy = 0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.5 + (((tickAnim - 19) / 1) * (-0.25-(0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.5)));
            zz = 0 + (((tickAnim - 19) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftthigh.rotationPointX = this.Leftthigh.rotationPointX + (float)(xx);
        this.Leftthigh.rotationPointY = this.Leftthigh.rotationPointY - (float)(yy);
        this.Leftthigh.rotationPointZ = this.Leftthigh.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 17.5 + (((tickAnim - 0) / 2) * (10-(17.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = -7.5 + (((tickAnim - 0) / 2) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 10 + (((tickAnim - 2) / 2) * (25-(10)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = -7.5 + (((tickAnim - 2) / 2) * (-15-(-7.5)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 25 + (((tickAnim - 4) / 3) * (42.5-(25)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = -15 + (((tickAnim - 4) / 3) * (-15-(-15)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 42.5 + (((tickAnim - 7) / 3) * (50-(42.5)));
            yy = 0 + (((tickAnim - 7) / 3) * (5-(0)));
            zz = -15 + (((tickAnim - 7) / 3) * (-20-(-15)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 50 + (((tickAnim - 10) / 5) * (40-(50)));
            yy = 5 + (((tickAnim - 10) / 5) * (5-(5)));
            zz = -20 + (((tickAnim - 10) / 5) * (-20-(-20)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 40 + (((tickAnim - 15) / 2) * (15-(40)));
            yy = 5 + (((tickAnim - 15) / 2) * (0-(5)));
            zz = -20 + (((tickAnim - 15) / 2) * (-10-(-20)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 15 + (((tickAnim - 17) / 1) * (-5-(15)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = -10 + (((tickAnim - 17) / 1) * (-10-(-10)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -5 + (((tickAnim - 18) / 2) * (17.5-(-5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = -10 + (((tickAnim - 18) / 2) * (-7.5-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftshin, Leftshin.rotateAngleX + (float) Math.toRadians(xx), Leftshin.rotateAngleY + (float) Math.toRadians(yy), Leftshin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.25-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.25 + (((tickAnim - 19) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.25)));
            zz = 0 + (((tickAnim - 19) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftshin.rotationPointX = this.Leftshin.rotationPointX + (float)(xx);
        this.Leftshin.rotationPointY = this.Leftshin.rotationPointY - (float)(yy);
        this.Leftshin.rotationPointZ = this.Leftshin.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -20 + (((tickAnim - 0) / 2) * (-32.5-(-20)));
            yy = 0 + (((tickAnim - 0) / 2) * (-5-(0)));
            zz = 5 + (((tickAnim - 0) / 2) * (-2.5-(5)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -32.5 + (((tickAnim - 2) / 2) * (22.5-(-32.5)));
            yy = -5 + (((tickAnim - 2) / 2) * (5-(-5)));
            zz = -2.5 + (((tickAnim - 2) / 2) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 22.5 + (((tickAnim - 4) / 3) * (35-(22.5)));
            yy = 5 + (((tickAnim - 4) / 3) * (5-(5)));
            zz = -2.5 + (((tickAnim - 4) / 3) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 35 + (((tickAnim - 7) / 3) * (37.5-(35)));
            yy = 5 + (((tickAnim - 7) / 3) * (-2.5-(5)));
            zz = -2.5 + (((tickAnim - 7) / 3) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 37.5 + (((tickAnim - 10) / 5) * (37.5-(37.5)));
            yy = -2.5 + (((tickAnim - 10) / 5) * (-2.5-(-2.5)));
            zz = -2.5 + (((tickAnim - 10) / 5) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 37.5 + (((tickAnim - 15) / 2) * (22.5-(37.5)));
            yy = -2.5 + (((tickAnim - 15) / 2) * (-2.5-(-2.5)));
            zz = -2.5 + (((tickAnim - 15) / 2) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 22.5 + (((tickAnim - 17) / 1) * (17.5-(22.5)));
            yy = -2.5 + (((tickAnim - 17) / 1) * (0-(-2.5)));
            zz = -2.5 + (((tickAnim - 17) / 1) * (7.5-(-2.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 17.5 + (((tickAnim - 18) / 2) * (-20-(17.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 7.5 + (((tickAnim - 18) / 2) * (5-(7.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lefthindfoot, Lefthindfoot.rotateAngleX + (float) Math.toRadians(xx), Lefthindfoot.rotateAngleY + (float) Math.toRadians(yy), Lefthindfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.25-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.25 + (((tickAnim - 19) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.25)));
            zz = 0 + (((tickAnim - 19) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Lefthindfoot.rotationPointX = this.Lefthindfoot.rotationPointX + (float)(xx);
        this.Lefthindfoot.rotationPointY = this.Lefthindfoot.rotationPointY - (float)(yy);
        this.Lefthindfoot.rotationPointZ = this.Lefthindfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-30-(0)));
            yy = 7.5 + (((tickAnim - 0) / 5) * (20-(7.5)));
            zz = 10 + (((tickAnim - 0) / 5) * (5-(10)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -30 + (((tickAnim - 5) / 2) * (-25-(-30)));
            yy = 20 + (((tickAnim - 5) / 2) * (20-(20)));
            zz = 5 + (((tickAnim - 5) / 2) * (-10-(5)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -25 + (((tickAnim - 7) / 1) * (-15-(-25)));
            yy = 20 + (((tickAnim - 7) / 1) * (0-(20)));
            zz = -10 + (((tickAnim - 7) / 1) * (-5-(-10)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -15 + (((tickAnim - 8) / 2) * (0-(-15)));
            yy = 0 + (((tickAnim - 8) / 2) * (-7.5-(0)));
            zz = -5 + (((tickAnim - 8) / 2) * (-7.5-(-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (27.5-(0)));
            yy = -7.5 + (((tickAnim - 10) / 2) * (-12.5-(-7.5)));
            zz = -7.5 + (((tickAnim - 10) / 2) * (-17.5-(-7.5)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 27.5 + (((tickAnim - 12) / 2) * (37.5-(27.5)));
            yy = -12.5 + (((tickAnim - 12) / 2) * (-7.5-(-12.5)));
            zz = -17.5 + (((tickAnim - 12) / 2) * (-17.5-(-17.5)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 37.5 + (((tickAnim - 14) / 3) * (25-(37.5)));
            yy = -7.5 + (((tickAnim - 14) / 3) * (7.5-(-7.5)));
            zz = -17.5 + (((tickAnim - 14) / 3) * (-2.5-(-17.5)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 25 + (((tickAnim - 17) / 3) * (0-(25)));
            yy = 7.5 + (((tickAnim - 17) / 3) * (7.5-(7.5)));
            zz = -2.5 + (((tickAnim - 17) / 3) * (10-(-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightthigh, Rightthigh.rotateAngleX + (float) Math.toRadians(xx), Rightthigh.rotateAngleY + (float) Math.toRadians(yy), Rightthigh.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.5 + (((tickAnim - 0) / 5) * (0.5-(0.5)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 5) / 2) * (0.5-(0.5)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 7) / 1) * (-0.25-(0.5)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = -0.25 + (((tickAnim - 8) / 1) * (0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.5-(-0.25)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.5 + (((tickAnim - 9) / 1) * (-0.25-(0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.5)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = -0.25 + (((tickAnim - 10) / 1) * (0.25-(-0.25)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = 0.25 + (((tickAnim - 11) / 1) * (0-(0.25)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 3) * (0.5-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 17) / 3) * (0.5-(0.5)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightthigh.rotationPointX = this.Rightthigh.rotationPointX + (float)(xx);
        this.Rightthigh.rotationPointY = this.Rightthigh.rotationPointY - (float)(yy);
        this.Rightthigh.rotationPointZ = this.Rightthigh.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 50 + (((tickAnim - 0) / 5) * (40-(50)));
            yy = -5 + (((tickAnim - 0) / 5) * (-5-(-5)));
            zz = 20 + (((tickAnim - 0) / 5) * (20-(20)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 40 + (((tickAnim - 5) / 2) * (15-(40)));
            yy = -5 + (((tickAnim - 5) / 2) * (0-(-5)));
            zz = 20 + (((tickAnim - 5) / 2) * (10-(20)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 15 + (((tickAnim - 7) / 1) * (-5-(15)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 10 + (((tickAnim - 7) / 1) * (10-(10)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -5 + (((tickAnim - 8) / 2) * (17.5-(-5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 10 + (((tickAnim - 8) / 2) * (7.5-(10)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 17.5 + (((tickAnim - 10) / 2) * (10-(17.5)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 7.5 + (((tickAnim - 10) / 2) * (7.5-(7.5)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 10 + (((tickAnim - 12) / 2) * (25-(10)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 7.5 + (((tickAnim - 12) / 2) * (15-(7.5)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 25 + (((tickAnim - 14) / 3) * (42.5-(25)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 15 + (((tickAnim - 14) / 3) * (15-(15)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 42.5 + (((tickAnim - 17) / 3) * (50-(42.5)));
            yy = 0 + (((tickAnim - 17) / 3) * (-5-(0)));
            zz = 15 + (((tickAnim - 17) / 3) * (20-(15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightshin, Rightshin.rotateAngleX + (float) Math.toRadians(xx), Rightshin.rotateAngleY + (float) Math.toRadians(yy), Rightshin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.25-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.25 + (((tickAnim - 9) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.25)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightshin.rotationPointX = this.Rightshin.rotationPointX + (float)(xx);
        this.Rightshin.rotationPointY = this.Rightshin.rotationPointY - (float)(yy);
        this.Rightshin.rotationPointZ = this.Rightshin.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 37.5 + (((tickAnim - 0) / 5) * (37.5-(37.5)));
            yy = 2.5 + (((tickAnim - 0) / 5) * (2.5-(2.5)));
            zz = 2.5 + (((tickAnim - 0) / 5) * (2.5-(2.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 37.5 + (((tickAnim - 5) / 2) * (22.5-(37.5)));
            yy = 2.5 + (((tickAnim - 5) / 2) * (2.5-(2.5)));
            zz = 2.5 + (((tickAnim - 5) / 2) * (2.5-(2.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 22.5 + (((tickAnim - 7) / 1) * (17.5-(22.5)));
            yy = 2.5 + (((tickAnim - 7) / 1) * (0-(2.5)));
            zz = 2.5 + (((tickAnim - 7) / 1) * (-7.5-(2.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 17.5 + (((tickAnim - 8) / 2) * (-20-(17.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = -7.5 + (((tickAnim - 8) / 2) * (-5-(-7.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -20 + (((tickAnim - 10) / 2) * (-32.5-(-20)));
            yy = 0 + (((tickAnim - 10) / 2) * (5-(0)));
            zz = -5 + (((tickAnim - 10) / 2) * (2.5-(-5)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -32.5 + (((tickAnim - 12) / 2) * (22.5-(-32.5)));
            yy = 5 + (((tickAnim - 12) / 2) * (-5-(5)));
            zz = 2.5 + (((tickAnim - 12) / 2) * (2.5-(2.5)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 22.5 + (((tickAnim - 14) / 3) * (35-(22.5)));
            yy = -5 + (((tickAnim - 14) / 3) * (-5-(-5)));
            zz = 2.5 + (((tickAnim - 14) / 3) * (2.5-(2.5)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 35 + (((tickAnim - 17) / 3) * (37.5-(35)));
            yy = -5 + (((tickAnim - 17) / 3) * (2.5-(-5)));
            zz = 2.5 + (((tickAnim - 17) / 3) * (2.5-(2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Righthindfoot, Righthindfoot.rotateAngleX + (float) Math.toRadians(xx), Righthindfoot.rotateAngleY + (float) Math.toRadians(yy), Righthindfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.25-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.25 + (((tickAnim - 9) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.25)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Righthindfoot.rotationPointX = this.Righthindfoot.rotationPointX + (float)(xx);
        this.Righthindfoot.rotationPointY = this.Righthindfoot.rotationPointY - (float)(yy);
        this.Righthindfoot.rotationPointZ = this.Righthindfoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*2.5), hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2.5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*1);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*0.75);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*-1);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -10 + (((tickAnim - 0) / 3) * (2.5-(-10)));
            yy = -40 + (((tickAnim - 0) / 3) * (12.5-(-40)));
            zz = -20 + (((tickAnim - 0) / 3) * (-10-(-20)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 2.5 + (((tickAnim - 3) / 2) * (10-(2.5)));
            yy = 12.5 + (((tickAnim - 3) / 2) * (20-(12.5)));
            zz = -10 + (((tickAnim - 3) / 2) * (-10-(-10)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 10 + (((tickAnim - 5) / 3) * (67.5-(10)));
            yy = 20 + (((tickAnim - 5) / 3) * (27.5-(20)));
            zz = -10 + (((tickAnim - 5) / 3) * (40-(-10)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 67.5 + (((tickAnim - 8) / 2) * (82.5-(67.5)));
            yy = 27.5 + (((tickAnim - 8) / 2) * (20-(27.5)));
            zz = 40 + (((tickAnim - 8) / 2) * (60-(40)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 82.5 + (((tickAnim - 10) / 3) * (60-(82.5)));
            yy = 20 + (((tickAnim - 10) / 3) * (22.5-(20)));
            zz = 60 + (((tickAnim - 10) / 3) * (50-(60)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 60 + (((tickAnim - 13) / 4) * (15-(60)));
            yy = 22.5 + (((tickAnim - 13) / 4) * (15-(22.5)));
            zz = 50 + (((tickAnim - 13) / 4) * (7.5-(50)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 15 + (((tickAnim - 17) / 2) * (0-(15)));
            yy = 15 + (((tickAnim - 17) / 2) * (-17.5-(15)));
            zz = 7.5 + (((tickAnim - 17) / 2) * (-10-(7.5)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 19) / 1) * (-10-(0)));
            yy = -17.5 + (((tickAnim - 19) / 1) * (-40-(-17.5)));
            zz = -10 + (((tickAnim - 19) / 1) * (-20-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.25 + (((tickAnim - 3) / 2) * (-0.25-(-0.25)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -0.25 + (((tickAnim - 5) / 3) * (-0.25-(-0.25)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.25 + (((tickAnim - 8) / 2) * (0.25-(-0.25)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.25 + (((tickAnim - 10) / 3) * (0.75-(0.25)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0.75 + (((tickAnim - 13) / 4) * (0.75-(0.75)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = 0.75 + (((tickAnim - 17) / 2) * (0.75-(0.75)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            yy = 0.75 + (((tickAnim - 19) / 1) * (0-(0.75)));
            zz = 0 + (((tickAnim - 19) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -30 + (((tickAnim - 0) / 3) * (-22.5-(-30)));
            yy = 5 + (((tickAnim - 0) / 3) * (-42.5-(5)));
            zz = 20 + (((tickAnim - 0) / 3) * (10-(20)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -22.5 + (((tickAnim - 3) / 2) * (-10-(-22.5)));
            yy = -42.5 + (((tickAnim - 3) / 2) * (-15-(-42.5)));
            zz = 10 + (((tickAnim - 3) / 2) * (35-(10)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -10 + (((tickAnim - 5) / 3) * (-10-(-10)));
            yy = -15 + (((tickAnim - 5) / 3) * (-20-(-15)));
            zz = 35 + (((tickAnim - 5) / 3) * (20-(35)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -10 + (((tickAnim - 8) / 2) * (-5-(-10)));
            yy = -20 + (((tickAnim - 8) / 2) * (-45-(-20)));
            zz = 20 + (((tickAnim - 8) / 2) * (-5-(20)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -5 + (((tickAnim - 10) / 3) * (-5-(-5)));
            yy = -45 + (((tickAnim - 10) / 3) * (-57.5-(-45)));
            zz = -5 + (((tickAnim - 10) / 3) * (-18-(-5)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -5 + (((tickAnim - 13) / 4) * (-12.5-(-5)));
            yy = -57.5 + (((tickAnim - 13) / 4) * (-72.5-(-57.5)));
            zz = -18 + (((tickAnim - 13) / 4) * (-7.5-(-18)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = -12.5 + (((tickAnim - 17) / 2) * (-17.5-(-12.5)));
            yy = -72.5 + (((tickAnim - 17) / 2) * (-47.5-(-72.5)));
            zz = -7.5 + (((tickAnim - 17) / 2) * (10-(-7.5)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -17.5 + (((tickAnim - 19) / 1) * (-30-(-17.5)));
            yy = -47.5 + (((tickAnim - 19) / 1) * (5-(-47.5)));
            zz = 10 + (((tickAnim - 19) / 1) * (20-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 2) / 1) * (0-(0.5)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (0.25-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0.25 + (((tickAnim - 4) / 1) * (0-(0.25)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 10 + (((tickAnim - 0) / 3) * (20-(10)));
            yy = 22.5 + (((tickAnim - 0) / 3) * (27.5-(22.5)));
            zz = 0 + (((tickAnim - 0) / 3) * (-7.5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 20 + (((tickAnim - 3) / 2) * (10-(20)));
            yy = 27.5 + (((tickAnim - 3) / 2) * (-20-(27.5)));
            zz = -7.5 + (((tickAnim - 3) / 2) * (-20-(-7.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 10 + (((tickAnim - 5) / 3) * (5-(10)));
            yy = -20 + (((tickAnim - 5) / 3) * (37.5-(-20)));
            zz = -20 + (((tickAnim - 5) / 3) * (-7.5-(-20)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 5 + (((tickAnim - 8) / 2) * (17.5-(5)));
            yy = 37.5 + (((tickAnim - 8) / 2) * (67.5-(37.5)));
            zz = -7.5 + (((tickAnim - 8) / 2) * (2.5-(-7.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 17.5 + (((tickAnim - 10) / 3) * (5-(17.5)));
            yy = 67.5 + (((tickAnim - 10) / 3) * (50-(67.5)));
            zz = 2.5 + (((tickAnim - 10) / 3) * (-7.5-(2.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 5 + (((tickAnim - 13) / 4) * (10-(5)));
            yy = 50 + (((tickAnim - 13) / 4) * (55-(50)));
            zz = -7.5 + (((tickAnim - 13) / 4) * (-5-(-7.5)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 10 + (((tickAnim - 17) / 2) * (-2.5-(10)));
            yy = 55 + (((tickAnim - 17) / 2) * (55-(55)));
            zz = -5 + (((tickAnim - 17) / 2) * (-17.5-(-5)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -2.5 + (((tickAnim - 19) / 1) * (10-(-2.5)));
            yy = 55 + (((tickAnim - 19) / 1) * (22.5-(55)));
            zz = -17.5 + (((tickAnim - 19) / 1) * (0-(-17.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+30))*-5), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*2.5), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-2.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+90))*2.5), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*5), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+120))*-2.5), neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-5), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*2.5));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-2.5), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*2.5), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 82.5 + (((tickAnim - 0) / 3) * (60-(82.5)));
            yy = -20 + (((tickAnim - 0) / 3) * (-22.5-(-20)));
            zz = -60 + (((tickAnim - 0) / 3) * (-50-(-60)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 60 + (((tickAnim - 3) / 4) * (15-(60)));
            yy = -22.5 + (((tickAnim - 3) / 4) * (-15-(-22.5)));
            zz = -50 + (((tickAnim - 3) / 4) * (-7.5-(-50)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 15 + (((tickAnim - 7) / 2) * (0-(15)));
            yy = -15 + (((tickAnim - 7) / 2) * (17.5-(-15)));
            zz = -7.5 + (((tickAnim - 7) / 2) * (10-(-7.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (-10-(0)));
            yy = 17.5 + (((tickAnim - 9) / 1) * (40-(17.5)));
            zz = 10 + (((tickAnim - 9) / 1) * (20-(10)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -10 + (((tickAnim - 10) / 3) * (2.5-(-10)));
            yy = 40 + (((tickAnim - 10) / 3) * (-12.5-(40)));
            zz = 20 + (((tickAnim - 10) / 3) * (10-(20)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 2.5 + (((tickAnim - 13) / 2) * (10-(2.5)));
            yy = -12.5 + (((tickAnim - 13) / 2) * (-20-(-12.5)));
            zz = 10 + (((tickAnim - 13) / 2) * (10-(10)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 10 + (((tickAnim - 15) / 3) * (67.5-(10)));
            yy = -20 + (((tickAnim - 15) / 3) * (-27.5-(-20)));
            zz = 10 + (((tickAnim - 15) / 3) * (-40-(10)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 67.5 + (((tickAnim - 18) / 2) * (82.5-(67.5)));
            yy = -27.5 + (((tickAnim - 18) / 2) * (-20-(-27.5)));
            zz = -40 + (((tickAnim - 18) / 2) * (-60-(-40)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.25 + (((tickAnim - 0) / 3) * (0.75-(0.25)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0.75 + (((tickAnim - 3) / 4) * (0.75-(0.75)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0.75 + (((tickAnim - 7) / 2) * (0.75-(0.75)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0.75 + (((tickAnim - 9) / 1) * (0-(0.75)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -0.25 + (((tickAnim - 13) / 2) * (-0.25-(-0.25)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = -0.25 + (((tickAnim - 15) / 3) * (-0.25-(-0.25)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = -0.25 + (((tickAnim - 18) / 2) * (0.25-(-0.25)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -5 + (((tickAnim - 0) / 3) * (-5-(-5)));
            yy = 45 + (((tickAnim - 0) / 3) * (57.5-(45)));
            zz = 5 + (((tickAnim - 0) / 3) * (18-(5)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -5 + (((tickAnim - 3) / 4) * (-12.5-(-5)));
            yy = 57.5 + (((tickAnim - 3) / 4) * (72.5-(57.5)));
            zz = 18 + (((tickAnim - 3) / 4) * (7.5-(18)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -12.5 + (((tickAnim - 7) / 2) * (-17.5-(-12.5)));
            yy = 72.5 + (((tickAnim - 7) / 2) * (47.5-(72.5)));
            zz = 7.5 + (((tickAnim - 7) / 2) * (-10-(7.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -17.5 + (((tickAnim - 9) / 1) * (-30-(-17.5)));
            yy = 47.5 + (((tickAnim - 9) / 1) * (-5-(47.5)));
            zz = -10 + (((tickAnim - 9) / 1) * (-20-(-10)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -30 + (((tickAnim - 10) / 3) * (-22.5-(-30)));
            yy = -5 + (((tickAnim - 10) / 3) * (42.5-(-5)));
            zz = -20 + (((tickAnim - 10) / 3) * (-10-(-20)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -22.5 + (((tickAnim - 13) / 2) * (-10-(-22.5)));
            yy = 42.5 + (((tickAnim - 13) / 2) * (15-(42.5)));
            zz = -10 + (((tickAnim - 13) / 2) * (-35-(-10)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -10 + (((tickAnim - 15) / 3) * (-10-(-10)));
            yy = 15 + (((tickAnim - 15) / 3) * (20-(15)));
            zz = -35 + (((tickAnim - 15) / 3) * (-20-(-35)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -10 + (((tickAnim - 18) / 2) * (-5-(-10)));
            yy = 20 + (((tickAnim - 18) / 2) * (45-(20)));
            zz = -20 + (((tickAnim - 18) / 2) * (5-(-20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0.5-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 12) / 1) * (0-(0.5)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (0.25-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = 0.25 + (((tickAnim - 14) / 1) * (0-(0.25)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 17.5 + (((tickAnim - 0) / 3) * (5-(17.5)));
            yy = -67.5 + (((tickAnim - 0) / 3) * (-50-(-67.5)));
            zz = -2.5 + (((tickAnim - 0) / 3) * (7.5-(-2.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 5 + (((tickAnim - 3) / 4) * (10-(5)));
            yy = -50 + (((tickAnim - 3) / 4) * (-55-(-50)));
            zz = 7.5 + (((tickAnim - 3) / 4) * (5-(7.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 10 + (((tickAnim - 7) / 2) * (-2.5-(10)));
            yy = -55 + (((tickAnim - 7) / 2) * (-55-(-55)));
            zz = 5 + (((tickAnim - 7) / 2) * (17.5-(5)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -2.5 + (((tickAnim - 9) / 1) * (10-(-2.5)));
            yy = -55 + (((tickAnim - 9) / 1) * (-22.5-(-55)));
            zz = 17.5 + (((tickAnim - 9) / 1) * (0-(17.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 10 + (((tickAnim - 10) / 3) * (20-(10)));
            yy = -22.5 + (((tickAnim - 10) / 3) * (-27.5-(-22.5)));
            zz = 0 + (((tickAnim - 10) / 3) * (7.5-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 20 + (((tickAnim - 13) / 2) * (10-(20)));
            yy = -27.5 + (((tickAnim - 13) / 2) * (20-(-27.5)));
            zz = 7.5 + (((tickAnim - 13) / 2) * (20-(7.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 10 + (((tickAnim - 15) / 3) * (5-(10)));
            yy = 20 + (((tickAnim - 15) / 3) * (-37.5-(20)));
            zz = 20 + (((tickAnim - 15) / 3) * (7.5-(20)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 18) / 2) * (17.5-(5)));
            yy = -37.5 + (((tickAnim - 18) / 2) * (-67.5-(-37.5)));
            zz = 7.5 + (((tickAnim - 18) / 2) * (-2.5-(7.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60))*-2.5), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*10), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+30))*-2.5), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*10), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-2.5), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*10), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCriocephalosaurus entity = (EntityPrehistoricFloraCriocephalosaurus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*3), hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*3), hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*-3));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*0.5);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*0.25);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-0.75);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (27.5-(0)));
            yy = 7.5 + (((tickAnim - 0) / 8) * (12.5-(7.5)));
            zz = 7.5 + (((tickAnim - 0) / 8) * (17.5-(7.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 27.5 + (((tickAnim - 8) / 7) * (37.5-(27.5)));
            yy = 12.5 + (((tickAnim - 8) / 7) * (7.5-(12.5)));
            zz = 17.5 + (((tickAnim - 8) / 7) * (17.5-(17.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 37.5 + (((tickAnim - 15) / 5) * (25-(37.5)));
            yy = 7.5 + (((tickAnim - 15) / 5) * (-7.5-(7.5)));
            zz = 17.5 + (((tickAnim - 15) / 5) * (2.5-(17.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 25 + (((tickAnim - 20) / 5) * (0-(25)));
            yy = -7.5 + (((tickAnim - 20) / 5) * (-7.5-(-7.5)));
            zz = 2.5 + (((tickAnim - 20) / 5) * (-10-(2.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 25) / 4) * (-30-(0)));
            yy = -7.5 + (((tickAnim - 25) / 4) * (-20-(-7.5)));
            zz = -10 + (((tickAnim - 25) / 4) * (-5-(-10)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = -30 + (((tickAnim - 29) / 3) * (-25-(-30)));
            yy = -20 + (((tickAnim - 29) / 3) * (-20-(-20)));
            zz = -5 + (((tickAnim - 29) / 3) * (10-(-5)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = -25 + (((tickAnim - 32) / 1) * (-15-(-25)));
            yy = -20 + (((tickAnim - 32) / 1) * (0-(-20)));
            zz = 10 + (((tickAnim - 32) / 1) * (5-(10)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -15 + (((tickAnim - 33) / 7) * (0-(-15)));
            yy = 0 + (((tickAnim - 33) / 7) * (7.5-(0)));
            zz = 5 + (((tickAnim - 33) / 7) * (7.5-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftthigh, Leftthigh.rotateAngleX + (float) Math.toRadians(xx), Leftthigh.rotateAngleY + (float) Math.toRadians(yy), Leftthigh.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -0.25 + (((tickAnim - 0) / 4) * (0.25-(-0.25)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0.25 + (((tickAnim - 4) / 4) * (0-(0.25)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0.5-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0.5 + (((tickAnim - 20) / 5) * (0.5-(0.5)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            yy = 0.5 + (((tickAnim - 25) / 4) * (0.5-(0.5)));
            zz = 0 + (((tickAnim - 25) / 4) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 29) / 3) * (0.5-(0.5)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 32) / 1) * (-0.25-(0.5)));
            zz = 0 + (((tickAnim - 32) / 1) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            yy = -0.25 + (((tickAnim - 33) / 4) * (0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.5-(-0.25)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            yy = 0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.5 + (((tickAnim - 37) / 3) * (-0.25-(0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.5)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftthigh.rotationPointX = this.Leftthigh.rotationPointX + (float)(xx);
        this.Leftthigh.rotationPointY = this.Leftthigh.rotationPointY - (float)(yy);
        this.Leftthigh.rotationPointZ = this.Leftthigh.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 17.5 + (((tickAnim - 0) / 8) * (10-(17.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = -7.5 + (((tickAnim - 0) / 8) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 10 + (((tickAnim - 8) / 7) * (25-(10)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = -7.5 + (((tickAnim - 8) / 7) * (-15-(-7.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 25 + (((tickAnim - 15) / 5) * (42.5-(25)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = -15 + (((tickAnim - 15) / 5) * (-15-(-15)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 42.5 + (((tickAnim - 20) / 5) * (50-(42.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (5-(0)));
            zz = -15 + (((tickAnim - 20) / 5) * (-20-(-15)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 50 + (((tickAnim - 25) / 4) * (40-(50)));
            yy = 5 + (((tickAnim - 25) / 4) * (5-(5)));
            zz = -20 + (((tickAnim - 25) / 4) * (-20-(-20)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 40 + (((tickAnim - 29) / 3) * (15-(40)));
            yy = 5 + (((tickAnim - 29) / 3) * (0-(5)));
            zz = -20 + (((tickAnim - 29) / 3) * (-10-(-20)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 15 + (((tickAnim - 32) / 1) * (-5-(15)));
            yy = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            zz = -10 + (((tickAnim - 32) / 1) * (-10-(-10)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 33) / 7) * (17.5-(-5)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = -10 + (((tickAnim - 33) / 7) * (-7.5-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftshin, Leftshin.rotateAngleX + (float) Math.toRadians(xx), Leftshin.rotateAngleY + (float) Math.toRadians(yy), Leftshin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.25-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.25 + (((tickAnim - 37) / 3) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.25)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftshin.rotationPointX = this.Leftshin.rotationPointX + (float)(xx);
        this.Leftshin.rotationPointY = this.Leftshin.rotationPointY - (float)(yy);
        this.Leftshin.rotationPointZ = this.Leftshin.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -20 + (((tickAnim - 0) / 8) * (-32.5-(-20)));
            yy = 0 + (((tickAnim - 0) / 8) * (-5-(0)));
            zz = 5 + (((tickAnim - 0) / 8) * (-2.5-(5)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -32.5 + (((tickAnim - 8) / 7) * (22.5-(-32.5)));
            yy = -5 + (((tickAnim - 8) / 7) * (5-(-5)));
            zz = -2.5 + (((tickAnim - 8) / 7) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 22.5 + (((tickAnim - 15) / 5) * (35-(22.5)));
            yy = 5 + (((tickAnim - 15) / 5) * (5-(5)));
            zz = -2.5 + (((tickAnim - 15) / 5) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 35 + (((tickAnim - 20) / 5) * (37.5-(35)));
            yy = 5 + (((tickAnim - 20) / 5) * (-2.5-(5)));
            zz = -2.5 + (((tickAnim - 20) / 5) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 37.5 + (((tickAnim - 25) / 4) * (37.5-(37.5)));
            yy = -2.5 + (((tickAnim - 25) / 4) * (-2.5-(-2.5)));
            zz = -2.5 + (((tickAnim - 25) / 4) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 37.5 + (((tickAnim - 29) / 3) * (22.5-(37.5)));
            yy = -2.5 + (((tickAnim - 29) / 3) * (-2.5-(-2.5)));
            zz = -2.5 + (((tickAnim - 29) / 3) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 22.5 + (((tickAnim - 32) / 1) * (17.5-(22.5)));
            yy = -2.5 + (((tickAnim - 32) / 1) * (0-(-2.5)));
            zz = -2.5 + (((tickAnim - 32) / 1) * (7.5-(-2.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 17.5 + (((tickAnim - 33) / 7) * (-20-(17.5)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 7.5 + (((tickAnim - 33) / 7) * (5-(7.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lefthindfoot, Lefthindfoot.rotateAngleX + (float) Math.toRadians(xx), Lefthindfoot.rotateAngleY + (float) Math.toRadians(yy), Lefthindfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.25-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.25 + (((tickAnim - 37) / 3) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.25)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Lefthindfoot.rotationPointX = this.Lefthindfoot.rotationPointX + (float)(xx);
        this.Lefthindfoot.rotationPointY = this.Lefthindfoot.rotationPointY - (float)(yy);
        this.Lefthindfoot.rotationPointZ = this.Lefthindfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 25 + (((tickAnim - 0) / 5) * (0-(25)));
            yy = 7.5 + (((tickAnim - 0) / 5) * (7.5-(7.5)));
            zz = -2.5 + (((tickAnim - 0) / 5) * (10-(-2.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (-30-(0)));
            yy = 7.5 + (((tickAnim - 5) / 4) * (20-(7.5)));
            zz = 10 + (((tickAnim - 5) / 4) * (5-(10)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -30 + (((tickAnim - 9) / 3) * (-25-(-30)));
            yy = 20 + (((tickAnim - 9) / 3) * (20-(20)));
            zz = 5 + (((tickAnim - 9) / 3) * (-10-(5)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -25 + (((tickAnim - 12) / 1) * (-15-(-25)));
            yy = 20 + (((tickAnim - 12) / 1) * (0-(20)));
            zz = -10 + (((tickAnim - 12) / 1) * (-5-(-10)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -15 + (((tickAnim - 13) / 7) * (0-(-15)));
            yy = 0 + (((tickAnim - 13) / 7) * (-7.5-(0)));
            zz = -5 + (((tickAnim - 13) / 7) * (-7.5-(-5)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (27.5-(0)));
            yy = -7.5 + (((tickAnim - 20) / 8) * (-12.5-(-7.5)));
            zz = -7.5 + (((tickAnim - 20) / 8) * (-17.5-(-7.5)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 27.5 + (((tickAnim - 28) / 7) * (37.5-(27.5)));
            yy = -12.5 + (((tickAnim - 28) / 7) * (-7.5-(-12.5)));
            zz = -17.5 + (((tickAnim - 28) / 7) * (-17.5-(-17.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 37.5 + (((tickAnim - 35) / 5) * (25-(37.5)));
            yy = -7.5 + (((tickAnim - 35) / 5) * (7.5-(-7.5)));
            zz = -17.5 + (((tickAnim - 35) / 5) * (-2.5-(-17.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightthigh, Rightthigh.rotateAngleX + (float) Math.toRadians(xx), Rightthigh.rotateAngleY + (float) Math.toRadians(yy), Rightthigh.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.5 + (((tickAnim - 0) / 5) * (0.5-(0.5)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 0.5 + (((tickAnim - 5) / 4) * (0.5-(0.5)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 9) / 3) * (0.5-(0.5)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 12) / 1) * (-0.25-(0.5)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = -0.25 + (((tickAnim - 13) / 4) * (0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.5-(-0.25)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.5 + (((tickAnim - 17) / 3) * (-0.25-(0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.5)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = -0.25 + (((tickAnim - 20) / 4) * (0.25-(-0.25)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = 0.25 + (((tickAnim - 24) / 4) * (0-(0.25)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0.5-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightthigh.rotationPointX = this.Rightthigh.rotationPointX + (float)(xx);
        this.Rightthigh.rotationPointY = this.Rightthigh.rotationPointY - (float)(yy);
        this.Rightthigh.rotationPointZ = this.Rightthigh.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 42.5 + (((tickAnim - 0) / 5) * (50-(42.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (-5-(0)));
            zz = 15 + (((tickAnim - 0) / 5) * (20-(15)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 50 + (((tickAnim - 5) / 4) * (40-(50)));
            yy = -5 + (((tickAnim - 5) / 4) * (-5-(-5)));
            zz = 20 + (((tickAnim - 5) / 4) * (20-(20)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 40 + (((tickAnim - 9) / 3) * (15-(40)));
            yy = -5 + (((tickAnim - 9) / 3) * (0-(-5)));
            zz = 20 + (((tickAnim - 9) / 3) * (10-(20)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 15 + (((tickAnim - 12) / 1) * (-5-(15)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 10 + (((tickAnim - 12) / 1) * (10-(10)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -5 + (((tickAnim - 13) / 7) * (17.5-(-5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 10 + (((tickAnim - 13) / 7) * (7.5-(10)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 17.5 + (((tickAnim - 20) / 8) * (10-(17.5)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 7.5 + (((tickAnim - 20) / 8) * (7.5-(7.5)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 10 + (((tickAnim - 28) / 7) * (25-(10)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 7.5 + (((tickAnim - 28) / 7) * (15-(7.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 25 + (((tickAnim - 35) / 5) * (42.5-(25)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 15 + (((tickAnim - 35) / 5) * (15-(15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightshin, Rightshin.rotateAngleX + (float) Math.toRadians(xx), Rightshin.rotateAngleY + (float) Math.toRadians(yy), Rightshin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.25-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.25 + (((tickAnim - 17) / 3) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.25)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightshin.rotationPointX = this.Rightshin.rotationPointX + (float)(xx);
        this.Rightshin.rotationPointY = this.Rightshin.rotationPointY - (float)(yy);
        this.Rightshin.rotationPointZ = this.Rightshin.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 35 + (((tickAnim - 0) / 5) * (37.5-(35)));
            yy = -5 + (((tickAnim - 0) / 5) * (2.5-(-5)));
            zz = 2.5 + (((tickAnim - 0) / 5) * (2.5-(2.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 37.5 + (((tickAnim - 5) / 4) * (37.5-(37.5)));
            yy = 2.5 + (((tickAnim - 5) / 4) * (2.5-(2.5)));
            zz = 2.5 + (((tickAnim - 5) / 4) * (2.5-(2.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 37.5 + (((tickAnim - 9) / 3) * (22.5-(37.5)));
            yy = 2.5 + (((tickAnim - 9) / 3) * (2.5-(2.5)));
            zz = 2.5 + (((tickAnim - 9) / 3) * (2.5-(2.5)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 22.5 + (((tickAnim - 12) / 1) * (17.5-(22.5)));
            yy = 2.5 + (((tickAnim - 12) / 1) * (0-(2.5)));
            zz = 2.5 + (((tickAnim - 12) / 1) * (-7.5-(2.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 17.5 + (((tickAnim - 13) / 7) * (-20-(17.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = -7.5 + (((tickAnim - 13) / 7) * (-5-(-7.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -20 + (((tickAnim - 20) / 8) * (-32.5-(-20)));
            yy = 0 + (((tickAnim - 20) / 8) * (5-(0)));
            zz = -5 + (((tickAnim - 20) / 8) * (2.5-(-5)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -32.5 + (((tickAnim - 28) / 7) * (22.5-(-32.5)));
            yy = 5 + (((tickAnim - 28) / 7) * (-5-(5)));
            zz = 2.5 + (((tickAnim - 28) / 7) * (2.5-(2.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 22.5 + (((tickAnim - 35) / 5) * (35-(22.5)));
            yy = -5 + (((tickAnim - 35) / 5) * (-5-(-5)));
            zz = 2.5 + (((tickAnim - 35) / 5) * (2.5-(2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Righthindfoot, Righthindfoot.rotateAngleX + (float) Math.toRadians(xx), Righthindfoot.rotateAngleY + (float) Math.toRadians(yy), Righthindfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.25-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.25 + (((tickAnim - 17) / 3) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.25)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Righthindfoot.rotationPointX = this.Righthindfoot.rotationPointX + (float)(xx);
        this.Righthindfoot.rotationPointY = this.Righthindfoot.rotationPointY - (float)(yy);
        this.Righthindfoot.rotationPointZ = this.Righthindfoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-2), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*-3), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*3));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 20 + (((tickAnim - 0) / 10) * (30-(20)));
            yy = 7.5 + (((tickAnim - 0) / 10) * (17.5-(7.5)));
            zz = -5 + (((tickAnim - 0) / 10) * (-10-(-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 30 + (((tickAnim - 10) / 8) * (97.5-(30)));
            yy = 17.5 + (((tickAnim - 10) / 8) * (17.5-(17.5)));
            zz = -10 + (((tickAnim - 10) / 8) * (47.5-(-10)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 97.5 + (((tickAnim - 18) / 2) * (90-(97.5)));
            yy = 17.5 + (((tickAnim - 18) / 2) * (35-(17.5)));
            zz = 47.5 + (((tickAnim - 18) / 2) * (62.5-(47.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 90 + (((tickAnim - 20) / 3) * (45-(90)));
            yy = 35 + (((tickAnim - 20) / 3) * (10-(35)));
            zz = 62.5 + (((tickAnim - 20) / 3) * (22.5-(62.5)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 45 + (((tickAnim - 23) / 2) * (5-(45)));
            yy = 10 + (((tickAnim - 23) / 2) * (-17.5-(10)));
            zz = 22.5 + (((tickAnim - 23) / 2) * (-2.5-(22.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 5 + (((tickAnim - 25) / 3) * (-5-(5)));
            yy = -17.5 + (((tickAnim - 25) / 3) * (-35-(-17.5)));
            zz = -2.5 + (((tickAnim - 25) / 3) * (-30-(-2.5)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -5 + (((tickAnim - 28) / 2) * (-5-(-5)));
            yy = -35 + (((tickAnim - 28) / 2) * (-42.5-(-35)));
            zz = -30 + (((tickAnim - 28) / 2) * (-30-(-30)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 30) / 10) * (20-(-5)));
            yy = -42.5 + (((tickAnim - 30) / 10) * (7.5-(-42.5)));
            zz = -30 + (((tickAnim - 30) / 10) * (-5-(-30)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));

 
        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-0.25-(0)));
            yy = -0.75 + (((tickAnim - 0) / 5) * (1.25-(-0.75)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -0.25 + (((tickAnim - 5) / 5) * (0-(-0.25)));
            yy = 1.25 + (((tickAnim - 5) / 5) * (1-(1.25)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = 1 + (((tickAnim - 10) / 8) * (-1-(1)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = -1 + (((tickAnim - 18) / 2) * (0-(-1)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0.5-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.5-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0.5 + (((tickAnim - 35) / 5) * (0-(0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.5 + (((tickAnim - 35) / 5) * (-0.75-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.5)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-22.5-(0)));
            yy = -42.5 + (((tickAnim - 0) / 10) * (-22.5-(-42.5)));
            zz = 2.5 + (((tickAnim - 0) / 10) * (32.5-(2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -22.5 + (((tickAnim - 10) / 8) * (-25-(-22.5)));
            yy = -22.5 + (((tickAnim - 10) / 8) * (-35-(-22.5)));
            zz = 32.5 + (((tickAnim - 10) / 8) * (20-(32.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -25 + (((tickAnim - 18) / 2) * (-17.5-(-25)));
            yy = -35 + (((tickAnim - 18) / 2) * (-75-(-35)));
            zz = 20 + (((tickAnim - 18) / 2) * (25-(20)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -17.5 + (((tickAnim - 20) / 3) * (-42.5-(-17.5)));
            yy = -75 + (((tickAnim - 20) / 3) * (-87.5-(-75)));
            zz = 25 + (((tickAnim - 20) / 3) * (20-(25)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -42.5 + (((tickAnim - 23) / 2) * (-55-(-42.5)));
            yy = -87.5 + (((tickAnim - 23) / 2) * (-55-(-87.5)));
            zz = 20 + (((tickAnim - 23) / 2) * (15-(20)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -55 + (((tickAnim - 25) / 3) * (-30-(-55)));
            yy = -55 + (((tickAnim - 25) / 3) * (-35-(-55)));
            zz = 15 + (((tickAnim - 25) / 3) * (35-(15)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -30 + (((tickAnim - 28) / 2) * (-30-(-30)));
            yy = -35 + (((tickAnim - 28) / 2) * (-5-(-35)));
            zz = 35 + (((tickAnim - 28) / 2) * (35-(35)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -30 + (((tickAnim - 30) / 10) * (0-(-30)));
            yy = -5 + (((tickAnim - 30) / 10) * (-42.5-(-5)));
            zz = 35 + (((tickAnim - 30) / 10) * (2.5-(35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.25-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.25 + (((tickAnim - 35) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.25)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -10 + (((tickAnim - 0) / 10) * (-5-(-10)));
            yy = 20 + (((tickAnim - 0) / 10) * (-17.5-(20)));
            zz = -7.5 + (((tickAnim - 0) / 10) * (-10-(-7.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -5 + (((tickAnim - 10) / 8) * (2.5-(-5)));
            yy = -17.5 + (((tickAnim - 10) / 8) * (47.5-(-17.5)));
            zz = -10 + (((tickAnim - 10) / 8) * (0-(-10)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 2.5 + (((tickAnim - 18) / 2) * (-5-(2.5)));
            yy = 47.5 + (((tickAnim - 18) / 2) * (37.5-(47.5)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -5 + (((tickAnim - 20) / 3) * (-5-(-5)));
            yy = 37.5 + (((tickAnim - 20) / 3) * (27.5-(37.5)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -5 + (((tickAnim - 23) / 2) * (-5-(-5)));
            yy = 27.5 + (((tickAnim - 23) / 2) * (45-(27.5)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -5 + (((tickAnim - 25) / 3) * (0-(-5)));
            yy = 45 + (((tickAnim - 25) / 3) * (30-(45)));
            zz = 0 + (((tickAnim - 25) / 3) * (-10-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 30 + (((tickAnim - 28) / 2) * (30-(30)));
            zz = -10 + (((tickAnim - 28) / 2) * (-12.5-(-10)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (-10-(0)));
            yy = 30 + (((tickAnim - 30) / 5) * (20-(30)));
            zz = -12.5 + (((tickAnim - 30) / 5) * (-12.5-(-12.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -10 + (((tickAnim - 35) / 5) * (-10-(-10)));
            yy = 20 + (((tickAnim - 35) / 5) * (20-(20)));
            zz = -12.5 + (((tickAnim - 35) / 5) * (-7.5-(-12.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.25-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.25 + (((tickAnim - 35) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.25)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*3), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*-3));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-2.5), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*2.5));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*2.5), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-2.5), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*2.5));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*2.5), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*-2.5));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*2), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 90 + (((tickAnim - 0) / 3) * (45-(90)));
            yy = -35 + (((tickAnim - 0) / 3) * (-10-(-35)));
            zz = -62.5 + (((tickAnim - 0) / 3) * (-22.5-(-62.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 45 + (((tickAnim - 3) / 2) * (5-(45)));
            yy = -10 + (((tickAnim - 3) / 2) * (17.5-(-10)));
            zz = -22.5 + (((tickAnim - 3) / 2) * (2.5-(-22.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 5 + (((tickAnim - 5) / 3) * (-5-(5)));
            yy = 17.5 + (((tickAnim - 5) / 3) * (35-(17.5)));
            zz = 2.5 + (((tickAnim - 5) / 3) * (30-(2.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -5 + (((tickAnim - 8) / 2) * (-5-(-5)));
            yy = 35 + (((tickAnim - 8) / 2) * (42.5-(35)));
            zz = 30 + (((tickAnim - 8) / 2) * (30-(30)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -5 + (((tickAnim - 10) / 10) * (20-(-5)));
            yy = 42.5 + (((tickAnim - 10) / 10) * (-7.5-(42.5)));
            zz = 30 + (((tickAnim - 10) / 10) * (5-(30)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 20 + (((tickAnim - 20) / 10) * (30-(20)));
            yy = -7.5 + (((tickAnim - 20) / 10) * (-17.5-(-7.5)));
            zz = 5 + (((tickAnim - 20) / 10) * (10-(5)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 30 + (((tickAnim - 30) / 8) * (97.5-(30)));
            yy = -17.5 + (((tickAnim - 30) / 8) * (-17.5-(-17.5)));
            zz = 10 + (((tickAnim - 30) / 8) * (-47.5-(10)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 97.5 + (((tickAnim - 38) / 2) * (90-(97.5)));
            yy = -17.5 + (((tickAnim - 38) / 2) * (-35-(-17.5)));
            zz = -47.5 + (((tickAnim - 38) / 2) * (-62.5-(-47.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.5-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -0.5 + (((tickAnim - 15) / 5) * (0-(-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.5 + (((tickAnim - 15) / 5) * (-0.75-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.5)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0.25-(0)));
            yy = -0.75 + (((tickAnim - 20) / 5) * (1.25-(-0.75)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0.25 + (((tickAnim - 25) / 5) * (0-(0.25)));
            yy = 1.25 + (((tickAnim - 25) / 5) * (1-(1.25)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = 1 + (((tickAnim - 30) / 8) * (-1-(1)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = -1 + (((tickAnim - 38) / 2) * (0-(-1)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -17.5 + (((tickAnim - 0) / 3) * (-42.5-(-17.5)));
            yy = 75 + (((tickAnim - 0) / 3) * (87.5-(75)));
            zz = -25 + (((tickAnim - 0) / 3) * (-20-(-25)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -42.5 + (((tickAnim - 3) / 2) * (-55-(-42.5)));
            yy = 87.5 + (((tickAnim - 3) / 2) * (55-(87.5)));
            zz = -20 + (((tickAnim - 3) / 2) * (-15-(-20)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -55 + (((tickAnim - 5) / 3) * (-30-(-55)));
            yy = 55 + (((tickAnim - 5) / 3) * (35-(55)));
            zz = -15 + (((tickAnim - 5) / 3) * (-35-(-15)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -30 + (((tickAnim - 8) / 2) * (-30-(-30)));
            yy = 35 + (((tickAnim - 8) / 2) * (5-(35)));
            zz = -35 + (((tickAnim - 8) / 2) * (-35-(-35)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -30 + (((tickAnim - 10) / 10) * (0-(-30)));
            yy = 5 + (((tickAnim - 10) / 10) * (42.5-(5)));
            zz = -35 + (((tickAnim - 10) / 10) * (-2.5-(-35)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (-22.5-(0)));
            yy = 42.5 + (((tickAnim - 20) / 10) * (22.5-(42.5)));
            zz = -2.5 + (((tickAnim - 20) / 10) * (-32.5-(-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -22.5 + (((tickAnim - 30) / 8) * (-25-(-22.5)));
            yy = 22.5 + (((tickAnim - 30) / 8) * (35-(22.5)));
            zz = -32.5 + (((tickAnim - 30) / 8) * (-20-(-32.5)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -25 + (((tickAnim - 38) / 2) * (-17.5-(-25)));
            yy = 35 + (((tickAnim - 38) / 2) * (75-(35)));
            zz = -20 + (((tickAnim - 38) / 2) * (-25-(-20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.25-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.25 + (((tickAnim - 15) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.25)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -5 + (((tickAnim - 0) / 3) * (-5-(-5)));
            yy = -37.5 + (((tickAnim - 0) / 3) * (-27.5-(-37.5)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -5 + (((tickAnim - 3) / 2) * (-5-(-5)));
            yy = -27.5 + (((tickAnim - 3) / 2) * (-45-(-27.5)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -5 + (((tickAnim - 5) / 3) * (0-(-5)));
            yy = -45 + (((tickAnim - 5) / 3) * (-30-(-45)));
            zz = 0 + (((tickAnim - 5) / 3) * (10-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -30 + (((tickAnim - 8) / 2) * (-30-(-30)));
            zz = 10 + (((tickAnim - 8) / 2) * (12.5-(10)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (-10-(0)));
            yy = -30 + (((tickAnim - 10) / 5) * (-20-(-30)));
            zz = 12.5 + (((tickAnim - 10) / 5) * (12.5-(12.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -10 + (((tickAnim - 15) / 5) * (-10-(-10)));
            yy = -20 + (((tickAnim - 15) / 5) * (-20-(-20)));
            zz = 12.5 + (((tickAnim - 15) / 5) * (7.5-(12.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -10 + (((tickAnim - 20) / 10) * (-5-(-10)));
            yy = -20 + (((tickAnim - 20) / 10) * (17.5-(-20)));
            zz = 7.5 + (((tickAnim - 20) / 10) * (10-(7.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -5 + (((tickAnim - 30) / 8) * (2.5-(-5)));
            yy = 17.5 + (((tickAnim - 30) / 8) * (-47.5-(17.5)));
            zz = 10 + (((tickAnim - 30) / 8) * (0-(10)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 2.5 + (((tickAnim - 38) / 2) * (-5-(2.5)));
            yy = -47.5 + (((tickAnim - 38) / 2) * (-37.5-(-47.5)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.25-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.25 + (((tickAnim - 15) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.25)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*-3), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-5), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-5), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*-10), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-5), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-10), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*5));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraCriocephalosaurus e = (EntityPrehistoricFloraCriocephalosaurus) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.rotate(this.body, (float) Math.toRadians(12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.chest, (float) Math.toRadians(12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftArm, (float) Math.toRadians(15.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.rightArm, (float) Math.toRadians(15.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftArm2, (float) Math.toRadians(-12.2), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.rightArm2, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck1, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(5);
        animator.rotate(this.body, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.chest, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftArm, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.rightArm, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck1, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(9);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.neck1, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.neck1, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks
        animator.startKeyframe(10);
        animator.move(this.hips, 0 , 5,0);
        animator.rotate(this.tail1, (float) Math.toRadians(55), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftthigh, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightthigh, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftshin, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightshin, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.hips, (float) Math.toRadians(-28), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(30);
        animator.resetKeyframe(10);
    }
}
