package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCriocephalosaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

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
        this.neck1.offsetY = -0.02F;
        this.neck1.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
//        this.setRotateAngle(Tail1, 0.06370451936226872F, 0.21223203437934937F, 0.0F);
//        this.setRotateAngle(Rightfrontfoot, 0.1485275233394591F, 0.4881685797985891F, 0.0F);
//        this.setRotateAngle(Hips, -0.4457571069383183F, (float) Math.toRadians(90), 0.0F);
//        this.setRotateAngle(Leftthigh, 0.10611601718967469F, 0.0F, -0.42446406875869874F);
//        this.setRotateAngle(Righthindfoot, -0.12740903872453743F, 0.0F, -0.08482300397719036F);
//        this.setRotateAngle(leftArm, 0.9128071854772289F, 0.42446406875869874F, -0.67928211291826F);
//        this.setRotateAngle(Rightshin, 0.23352505591421208F, 0.0F, -0.38205256260891435F);
//        this.setRotateAngle(rightArm, 0.21223203437934937F, -0.27593656206399647F, 0.9339256534473936F);
//        this.setRotateAngle(Head, 0.6579891413176677F, 0.0F, 0.0F);
//        this.setRotateAngle(Leftshin, 0.33964105645913F, 0.0F, 0.38205256260891435F);
//        this.setRotateAngle(Belly, 0.1911135497644277F, 0.0F, 0.0F);
//        this.setRotateAngle(leftArm2, -0.40334560078853393F, 0.31834805156902407F, 0.5942845969882637F);
//        this.setRotateAngle(Tail2, 0.0F, 0.23352505591421208F, 0.0F);
//        this.setRotateAngle(Rightthigh, 0.8915142138766367F, -0.10611601718967469F, 0.46705011182842415F);
//        this.setRotateAngle(Front, 0.36093409463874954F, 0.0F, 0.0F);
//        this.setRotateAngle(Domebase, -0.08482300397719036F, 0.0F, 0.0F);
//        this.setRotateAngle(Domefront, 1.018923235956417F, 0.0F, 0.0F);
//        this.setRotateAngle(Leftfrontfoot, 0.33964105645913F, 0.0F, 0.0F);
//        this.setRotateAngle(Neck, 0.169820528229565F, 0.0F, 0.0F);
//        this.setRotateAngle(rightArm2, -0.67928211291826F, -0.46705011182842415F, -0.5942845969882637F);
//        this.setRotateAngle(Headslope, 0.67928211291826F, 0.0F, 0.0F);
//        this.setRotateAngle(Upperjaw, 0.2546435405291338F, 0.0F, 0.0F);
//        this.setRotateAngle(Tail3, 0.08482300397719036F, 0.5094616179782085F, 0.0F);
//        this.setRotateAngle(Dome, 0.7641051252178287F, 0.0F, 0.0F);
//        this.setRotateAngle(Lowerjaw, 0.7216936190680444F, 0.0F, 0.0F);
//        this.setRotateAngle(Lefthindfoot, 0.021293017373673524F, 0.0F, 0.0F);
//        this.Hips.offsetX = 0.13F;
//        this.Hips.offsetZ = -0.13F;
//        this.Hips.offsetY = -0.155F;
//        this.Hips.render(0.01F);
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
        this.root.offsetY = 0.0F;
        this.root.offsetZ = 0.3F;

        EntityPrehistoricFloraCriocephalosaurus Criocephalosaurus = (EntityPrehistoricFloraCriocephalosaurus) e;
        float masterSpeed = Criocephalosaurus.getTravelSpeed();

        this.faceTarget(f3, f4, 4, neck1);
        this.faceTarget(f3, f4, 4, neck2);
        this.faceTarget(f3, f4, 4, head);

        AdvancedModelRendererExtended[] Tail = {this.tail1, this.tail2, this.tail3};

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

        if (f3 == 0.0F || !Criocephalosaurus.getIsMoving()) { //Not moving
            this.swing(neck1, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck1, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.chainFlap(Tail, (0.06F*0.9F), 0.10F, 0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
        }

        //float speed = masterSpeed / 2.625F;
        float speed = masterSpeed / 2.225F;
        if (Criocephalosaurus.getIsFast()) {
            speed = speed * 2;
        }

        this.leftArm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 1, f2, 1.5F);;
        this.rightArm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 4, f2, 1.5F);;
        this.Leftthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 4, f2, 1.5F);;
        this.Rightthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 1, f2, 1.5F);;

        this.flap(leftArm, speed, -0.2F, true, 4, 0.15F, f2, 1F);
        this.flap(rightArm, speed, 0.2F, true, 7, -0.15F, f2, 1F);
        this.flap(Leftthigh, speed, 0.1F, false, 7, -0.05F, f2, 1F);
        this.flap(Rightthigh, speed, -0.1F, false, 4, 0.05F, f2, 1F);

        this.walk(leftArm, speed, 0.40F, true, 5, 0.30F, f2, 1F);
        this.walk(rightArm, speed, 0.40F, true, 8, 0.30F, f2, 1F);
        this.walk(Leftthigh, speed, 0.30F, true, 8, 0F, f2, 1F);
        this.walk(Rightthigh, speed, 0.30F, true, 5, 0F, f2, 1F);

        this.walk(leftArm2, speed, 0.25F, true, 6, 0F, f2, 1F);
        this.walk(rightArm2, speed, 0.25F, true, 9, 0F, f2, 1F);
        this.walk(Leftshin, speed, 0.20F, true, 9, 0F, f2, 1F);
        this.walk(Rightshin, speed, 0.20F, true, 6, 0F, f2, 1F);

        this.flap(leftArm2, speed, 0.10F, true, 0, 0.05F, f2, 1F);
        this.flap(rightArm2, speed, -0.10F, true, 3, -0.05F, f2, 1F);
        this.flap(Leftshin, speed, -0.10F, false, 3, -0.05F, f2, 1F);
        this.flap(Rightshin, speed, 0.10F, false, 0, 0.05F, f2, 1F);

        this.walk(leftArm3, speed, 0.30F, true, 2, -0.10F, f2, 1F);
        this.walk(rightArm3, speed, 0.30F, true, 5, -0.10F, f2, 1F);
        this.walk(Lefthindfoot, speed, 0.25F, true, 5, -0.08F, f2, 1F);
        this.walk(Righthindfoot, speed, 0.25F, true, 2, -0.08F, f2, 1F);

        this.bobExtended(hips, speed * 2F, 0.2F, false, 2.5F,  f2, 1F);

        this.flap(hips, speed, 0.12F, false, 5.0F,0.06F, f2, 1.0F);
        this.flap(body, speed, -0.12F, false, 5.0F,-0.06F, f2, 1.0F);
        this.flap(chest, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);

        this.walk(chest, speed * 2, 0.05F, false, 2.5F,-0.01F, f2, 0.8F);

        this.swing(neck1, speed, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
        this.walk(neck1, speed * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
        this.chainFlap(Tail, (speed*0.6F), 0.20F, 0.2F, f2, 1F);
        this.chainSwing(Tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

        this.hips.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(2.2), false, 1.5F, f2, 1);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraCriocephalosaurus e = (EntityPrehistoricFloraCriocephalosaurus) entity;
        animator.update(entity);
        this.resetToDefaultPose();
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
