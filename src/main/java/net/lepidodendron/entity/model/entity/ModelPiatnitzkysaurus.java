package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPiatnitzkysaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelPiatnitzkysaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended bone12;
    private final AdvancedModelRendererExtended hips;
    private final AdvancedModelRendererExtended back;
    private final AdvancedModelRendererExtended shoulders;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended neck2;
    private final AdvancedModelRendererExtended neck3;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended uperjaw;
    private final AdvancedModelRendererExtended bone3;
    private final AdvancedModelRendererExtended bone16;
    private final AdvancedModelRendererExtended bone17;
    private final AdvancedModelRendererExtended snout;
    private final AdvancedModelRendererExtended bone5;
    private final AdvancedModelRendererExtended bone6;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended bone2;
    private final AdvancedModelRendererExtended bone4;
    private final AdvancedModelRendererExtended bone10;
    private final AdvancedModelRendererExtended bone11;
    private final AdvancedModelRendererExtended lowerjaw;
    private final AdvancedModelRendererExtended bone;
    private final AdvancedModelRendererExtended bone8;
    private final AdvancedModelRendererExtended bone18;
    private final AdvancedModelRendererExtended bone19;
    private final AdvancedModelRendererExtended bone9;
    private final AdvancedModelRendererExtended bone7;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended bone49;
    private final AdvancedModelRendererExtended bone50;
    private final AdvancedModelRendererExtended bone28;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended bone13;
    private final AdvancedModelRendererExtended bone14;
    private final AdvancedModelRendererExtended bone15;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended tail1;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended tail4;
    private final AdvancedModelRendererExtended tail5;
    private final AdvancedModelRendererExtended Lleg1;
    private final AdvancedModelRendererExtended Lleg2;
    private final AdvancedModelRendererExtended Lleg3;
    private final AdvancedModelRendererExtended Lfoot;
    private final AdvancedModelRendererExtended bone20;
    private final AdvancedModelRendererExtended Rleg1;
    private final AdvancedModelRendererExtended Rleg2;
    private final AdvancedModelRendererExtended Rleg3;
    private final AdvancedModelRendererExtended Rfoot;
    private final AdvancedModelRendererExtended toe;

    private ModelAnimator animator;

    public ModelPiatnitzkysaurus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.bone12 = new AdvancedModelRendererExtended(this);
        this.bone12.setRotationPoint(0.0F, 25.0F, 7.0F);


        this.hips = new AdvancedModelRendererExtended(this);
        this.hips.setRotationPoint(0.0F, -18.9F, -9.2F);
        this.bone12.addChild(hips);
        this.setRotateAngle(hips, -0.1484F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 19, -3.0F, -3.0F, 0.0F, 6, 9, 7, 0.0F, false));

        this.back = new AdvancedModelRendererExtended(this);
        this.back.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.hips.addChild(back);
        this.setRotateAngle(back, 0.1309F, 0.0F, 0.0F);
        this.back.cubeList.add(new ModelBox(back, 0, 0, -3.5F, 0.0F, -9.0F, 7, 10, 9, 0.0F, false));

        this.shoulders = new AdvancedModelRendererExtended(this);
        this.shoulders.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.back.addChild(shoulders);
        this.setRotateAngle(shoulders, 0.1309F, 0.0F, 0.0F);
        this.shoulders.cubeList.add(new ModelBox(shoulders, 26, 22, -3.0F, 0.0F, -5.0F, 6, 9, 5, 0.0F, false));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.0F, 2.0F, -4.0F);
        this.shoulders.addChild(neck);
        this.setRotateAngle(neck, -0.3491F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 44, 40, -2.0F, -2.0F, -3.0F, 4, 6, 4, 0.0F, false));

        this.neck2 = new AdvancedModelRendererExtended(this);
        this.neck2.setRotationPoint(0.0F, 4.0F, -3.0F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.2007F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 51, 50, -1.5F, -6.0F, -3.0F, 3, 6, 3, 0.0F, false));

        this.neck3 = new AdvancedModelRendererExtended(this);
        this.neck3.setRotationPoint(0.0F, -6.0F, -3.0F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.4363F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 54, 27, -1.45F, 0.0F, -3.0F, 2, 5, 3, 0.0F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, 0.7F, -2.55F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.1745F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 50, 0, -2.0F, 0.0F, -3.0F, 4, 2, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 36, 15, -2.0F, -0.7F, -3.0F, 4, 1, 3, -0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 60, 50, -2.0F, -0.7F, -3.5F, 4, 2, 1, -0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 26, 48, -2.0F, 1.0F, -3.5F, 4, 1, 1, -0.01F, false));

        this.uperjaw = new AdvancedModelRendererExtended(this);
        this.uperjaw.setRotationPoint(0.0F, 1.0F, -3.5F);
        this.head.addChild(uperjaw);
        this.setRotateAngle(uperjaw, 0.1833F, 0.0F, 0.0F);
        this.uperjaw.cubeList.add(new ModelBox(uperjaw, 19, 22, -1.0F, 0.0F, -3.0F, 2, 1, 3, 0.0F, false));
        this.uperjaw.cubeList.add(new ModelBox(uperjaw, 61, 32, -1.25F, 0.0F, -2.2F, 1, 1, 3, 0.0F, false));
        this.uperjaw.cubeList.add(new ModelBox(uperjaw, 34, 2, 0.25F, 0.0F, -2.2F, 1, 1, 3, 0.0F, false));

        this.bone3 = new AdvancedModelRendererExtended(this);
        this.bone3.setRotationPoint(0.0F, 1.0F, -3.0F);
        this.uperjaw.addChild(bone3);
        this.setRotateAngle(bone3, -0.2182F, 0.0F, 0.0F);
        this.bone3.cubeList.add(new ModelBox(bone3, 61, 0, -1.0F, -1.0F, -2.0F, 2, 1, 2, 0.0F, false));
        this.bone3.cubeList.add(new ModelBox(bone3, 20, 41, -1.0F, -1.0F, -2.2F, 2, 1, 1, -0.01F, false));

        this.bone16 = new AdvancedModelRendererExtended(this);
        this.bone16.setRotationPoint(0.0F, -0.2F, -2.0F);
        this.bone3.addChild(bone16);
        this.setRotateAngle(bone16, -0.0873F, 0.0F, 0.0F);
        this.bone16.cubeList.add(new ModelBox(bone16, 26, 22, -0.8F, -0.3F, 0.0F, 0, 1, 2, 0.0F, false));
        this.bone16.cubeList.add(new ModelBox(bone16, 26, 21, 0.8F, -0.3F, 0.0F, 0, 1, 2, 0.0F, false));

        this.bone17 = new AdvancedModelRendererExtended(this);
        this.bone17.setRotationPoint(0.0F, -0.6F, 2.0F);
        this.bone3.addChild(bone17);
        this.setRotateAngle(bone17, 0.3054F, 0.0F, 0.0F);
        this.bone17.cubeList.add(new ModelBox(bone17, 26, 20, -0.8F, -0.3F, -2.0F, 0, 1, 2, 0.0F, false));
        this.bone17.cubeList.add(new ModelBox(bone17, 23, 6, 0.8F, -0.3F, -2.0F, 0, 1, 2, 0.0F, false));

        this.snout = new AdvancedModelRendererExtended(this);
        this.snout.setRotationPoint(0.0F, -1.0F, -2.2F);
        this.bone3.addChild(snout);
        this.setRotateAngle(snout, -0.6981F, 0.0F, 0.0F);
        this.snout.cubeList.add(new ModelBox(snout, 35, 36, -0.95F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

        this.bone5 = new AdvancedModelRendererExtended(this);
        this.bone5.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.snout.addChild(bone5);
        this.setRotateAngle(bone5, -0.6545F, 0.0F, 0.0F);
        this.bone5.cubeList.add(new ModelBox(bone5, 0, 61, -1.0F, -4.0F, 0.0F, 2, 4, 2, -0.01F, false));

        this.bone6 = new AdvancedModelRendererExtended(this);
        this.bone6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone5.addChild(bone6);
        this.setRotateAngle(bone6, -0.2705F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, -0.3F, 1.4F);
        this.bone6.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.9163F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 47, 15, -0.95F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.bone2 = new AdvancedModelRendererExtended(this);
        this.bone2.setRotationPoint(-1.0F, -1.0F, 0.0F);
        this.bone5.addChild(bone2);
        this.setRotateAngle(bone2, 0.1745F, 0.0436F, -0.0873F);
        this.bone2.cubeList.add(new ModelBox(bone2, 44, 42, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.bone4 = new AdvancedModelRendererExtended(this);
        this.bone4.setRotationPoint(1.0F, -1.0F, 0.0F);
        this.bone2.addChild(bone4);
        this.setRotateAngle(bone4, -0.1745F, -0.0873F, -0.1745F);
        this.bone4.cubeList.add(new ModelBox(bone4, 43, 22, -1.0F, -3.0F, 0.05F, 1, 3, 1, 0.0F, false));

        this.bone10 = new AdvancedModelRendererExtended(this);
        this.bone10.setRotationPoint(1.0F, -1.0F, 0.0F);
        this.bone5.addChild(bone10);
        this.setRotateAngle(bone10, 0.1745F, -0.0436F, 0.0873F);
        this.bone10.cubeList.add(new ModelBox(bone10, 44, 40, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.bone11 = new AdvancedModelRendererExtended(this);
        this.bone11.setRotationPoint(-1.0F, -1.0F, 0.0F);
        this.bone10.addChild(bone11);
        this.setRotateAngle(bone11, -0.1745F, 0.0873F, 0.1745F);
        this.bone11.cubeList.add(new ModelBox(bone11, 14, 35, 0.0F, -3.0F, 0.05F, 1, 3, 1, 0.0F, false));

        this.lowerjaw = new AdvancedModelRendererExtended(this);
        this.lowerjaw.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.head.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 23, 0, -2.0F, 0.0F, -3.0F, 4, 2, 3, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 23, 5, -2.0F, 0.0F, -3.5F, 4, 2, 1, -0.01F, false));

        this.bone = new AdvancedModelRendererExtended(this);
        this.bone.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.lowerjaw.addChild(bone);
        this.setRotateAngle(bone, -0.1745F, 0.0F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 31, 60, -1.5F, -2.0F, 0.0F, 3, 2, 3, 0.0F, false));

        this.bone8 = new AdvancedModelRendererExtended(this);
        this.bone8.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.lowerjaw.addChild(bone8);
        this.setRotateAngle(bone8, 0.1833F, 0.0F, 0.0F);
        this.bone8.cubeList.add(new ModelBox(bone8, 34, 0, -1.0F, 0.0F, -3.0F, 2, 1, 1, 0.0F, false));
        this.bone8.cubeList.add(new ModelBox(bone8, 9, 50, -1.25F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));
        this.bone8.cubeList.add(new ModelBox(bone8, 0, 6, -0.75F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.bone18 = new AdvancedModelRendererExtended(this);
        this.bone18.setRotationPoint(0.0F, 0.0F, -0.3F);
        this.bone8.addChild(bone18);
        this.bone18.cubeList.add(new ModelBox(bone18, 0, 22, -0.6F, -0.6F, -3.0F, 0, 1, 3, 0.0F, false));
        this.bone18.cubeList.add(new ModelBox(bone18, 0, 21, 0.6F, -0.6F, -3.0F, 0, 1, 3, 0.0F, false));

        this.bone19 = new AdvancedModelRendererExtended(this);
        this.bone19.setRotationPoint(0.0F, -0.2F, -3.8F);
        this.bone8.addChild(bone19);
        this.setRotateAngle(bone19, -0.2618F, 0.0F, 0.0F);
        this.bone19.cubeList.add(new ModelBox(bone19, 0, 5, -0.6F, -0.6F, -1.0F, 0, 1, 1, 0.0F, false));
        this.bone19.cubeList.add(new ModelBox(bone19, 0, 0, 0.6F, -0.6F, -1.0F, 0, 1, 1, 0.0F, false));

        this.bone9 = new AdvancedModelRendererExtended(this);
        this.bone9.setRotationPoint(0.0F, 2.0F, -3.5F);
        this.lowerjaw.addChild(bone9);
        this.setRotateAngle(bone9, -0.0873F, 0.0F, 0.0F);
        this.bone9.cubeList.add(new ModelBox(bone9, 44, 55, -0.95F, -1.2F, -5.0F, 1, 1, 5, 0.0F, false));

        this.bone7 = new AdvancedModelRendererExtended(this);
        this.bone7.setRotationPoint(0.0F, 2.0F, -3.5F);
        this.lowerjaw.addChild(bone7);


        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone7.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3054F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 14, 35, -0.5F, -1.0F, -1.0F, 1, 1, 5, 0.0F, false));

        this.bone49 = new AdvancedModelRendererExtended(this);
        this.bone49.setRotationPoint(-2.1F, 8.1F, -3.0F);
        this.shoulders.addChild(bone49);
        this.setRotateAngle(bone49, 0.7854F, -0.2618F, 0.0436F);
        this.bone49.cubeList.add(new ModelBox(bone49, 39, 52, -1.2427F, -0.6622F, -1.227F, 2, 5, 3, 0.0F, false));

        this.bone50 = new AdvancedModelRendererExtended(this);
        this.bone50.setRotationPoint(1.0569F, 3.8921F, -0.3176F);
        this.bone49.addChild(bone50);
        this.setRotateAngle(bone50, -1.1345F, -0.0175F, 0.0F);
        this.bone50.cubeList.add(new ModelBox(bone50, 60, 44, -2.1773F, -1.7054F, -0.713F, 2, 4, 2, 0.0F, false));

        this.bone28 = new AdvancedModelRendererExtended(this);
        this.bone28.setRotationPoint(-0.3779F, -0.6527F, 5.0804F);
        this.bone50.addChild(bone28);
        this.setRotateAngle(bone28, 0.0F, 0.0F, -0.3927F);


        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(-1.7972F, 3.5315F, -4.5961F);
        this.bone28.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 35, 39, -1.0F, -1.6F, -1.6F, 2, 3, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(-1.7972F, 3.5315F, -4.5961F);
        this.bone28.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1309F, 0.2182F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 35, -1.0F, -1.6F, -0.7F, 1, 3, 2, 0.0F, false));

        this.bone13 = new AdvancedModelRendererExtended(this);
        this.bone13.setRotationPoint(2.1F, 8.1F, -3.0F);
        this.shoulders.addChild(bone13);
        this.setRotateAngle(bone13, 0.7854F, 0.2618F, -0.0436F);
        this.bone13.cubeList.add(new ModelBox(bone13, 29, 52, -0.7573F, -0.6622F, -1.227F, 2, 5, 3, 0.0F, false));

        this.bone14 = new AdvancedModelRendererExtended(this);
        this.bone14.setRotationPoint(-0.0569F, 3.8921F, -0.3176F);
        this.bone13.addChild(bone14);
        this.setRotateAngle(bone14, -1.1345F, 0.0175F, 0.0F);
        this.bone14.cubeList.add(new ModelBox(bone14, 0, 0, -0.8225F, -1.6896F, -0.7204F, 2, 4, 2, 0.0F, false));

        this.bone15 = new AdvancedModelRendererExtended(this);
        this.bone15.setRotationPoint(-0.622F, -0.6369F, 5.0731F);
        this.bone14.addChild(bone15);
        this.setRotateAngle(bone15, 0.0F, 0.0F, 0.3927F);


        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(1.7972F, 3.5315F, -4.5961F);
        this.bone15.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2618F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 21, 35, -1.0F, -1.6F, -1.6F, 2, 3, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(1.7972F, 3.5315F, -4.5961F);
        this.bone15.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1309F, -0.2182F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 19, 0.0F, -1.6F, -0.7F, 1, 3, 2, 0.0F, false));

        this.tail1 = new AdvancedModelRendererExtended(this);
        this.tail1.setRotationPoint(0.0F, 1.5F, 6.6F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, 0.0873F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 47, 15, -2.5F, -4.5F, 0.0F, 5, 7, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, -0.9F, 4.8F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0611F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 20, 36, -2.0F, -3.5F, 0.0F, 4, 5, 7, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, -0.4F, 6.7F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0129F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 40, 28, -1.5F, -3.0F, 0.0F, 3, 4, 8, 0.0F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.0F, -0.9F, 7.8F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0803F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 21, 8, -1.0F, -2.0F, 0.0F, 2, 3, 11, 0.0F, false));

        this.tail5 = new AdvancedModelRendererExtended(this);
        this.tail5.setRotationPoint(0.0F, -1.0F, 10.4F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1044F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 32, 40, -0.5F, -1.0F, 0.0F, 1, 2, 10, 0.0F, false));

        this.Lleg1 = new AdvancedModelRendererExtended(this);
        this.Lleg1.setRotationPoint(-2.3F, -17.7F, -4.5F);
        this.bone12.addChild(Lleg1);
        this.setRotateAngle(Lleg1, -0.34F, 0.0524F, 0.0F);
        this.Lleg1.cubeList.add(new ModelBox(Lleg1, 36, 0, -2.5F, -1.0F, -4.0F, 4, 9, 6, 0.0F, false));

        this.Lleg2 = new AdvancedModelRendererExtended(this);
        this.Lleg2.setRotationPoint(0.0F, 8.0F, -3.9F);
        this.Lleg1.addChild(Lleg2);
        this.setRotateAngle(Lleg2, 0.7564F, 0.0F, 0.0F);
        this.Lleg2.cubeList.add(new ModelBox(Lleg2, 0, 50, -2.0F, 0.0F, 0.0F, 3, 8, 3, 0.0F, false));

        this.Lleg3 = new AdvancedModelRendererExtended(this);
        this.Lleg3.setRotationPoint(0.0F, 8.0F, 3.0F);
        this.Lleg2.addChild(Lleg3);
        this.setRotateAngle(Lleg3, -0.6119F, 0.0F, 0.0F);
        this.Lleg3.cubeList.add(new ModelBox(Lleg3, 59, 37, -1.5F, 0.0F, -3.0F, 2, 4, 3, 0.0F, false));

        this.Lfoot = new AdvancedModelRendererExtended(this);
        this.Lfoot.setRotationPoint(0.0F, 4.7F, -1.0F);
        this.Lleg3.addChild(Lfoot);
        this.setRotateAngle(Lfoot, 0.1745F, 0.0F, 0.0F);
        this.Lfoot.cubeList.add(new ModelBox(Lfoot, 53, 59, -2.0F, -1.8056F, -1.7505F, 3, 2, 3, 0.0F, false));

        this.bone20 = new AdvancedModelRendererExtended(this);
        this.bone20.setRotationPoint(-0.5F, -0.8056F, -1.7505F);
        this.Lfoot.addChild(bone20);
        this.bone20.cubeList.add(new ModelBox(bone20, 56, 10, -1.5F, -1.0F, -2.0F, 3, 2, 3, 0.0F, false));

        this.Rleg1 = new AdvancedModelRendererExtended(this);
        this.Rleg1.setRotationPoint(2.3F, -17.5F, -4.5F);
        this.bone12.addChild(Rleg1);
        this.setRotateAngle(Rleg1, -0.34F, -0.0524F, 0.0F);
        this.Rleg1.cubeList.add(new ModelBox(Rleg1, 0, 35, -1.5F, -1.0F, -4.0F, 4, 9, 6, 0.0F, false));

        this.Rleg2 = new AdvancedModelRendererExtended(this);
        this.Rleg2.setRotationPoint(0.0F, 8.0F, -3.9F);
        this.Rleg1.addChild(Rleg2);
        this.setRotateAngle(Rleg2, 0.7564F, 0.0F, 0.0F);
        this.Rleg2.cubeList.add(new ModelBox(Rleg2, 17, 48, -1.0F, 0.0F, 0.0F, 3, 8, 3, 0.0F, false));

        this.Rleg3 = new AdvancedModelRendererExtended(this);
        this.Rleg3.setRotationPoint(0.0F, 8.0F, 3.0F);
        this.Rleg2.addChild(Rleg3);
        this.setRotateAngle(Rleg3, -0.6119F, 0.0F, 0.0F);
        this.Rleg3.cubeList.add(new ModelBox(Rleg3, 9, 58, -0.5F, 0.0F, -3.0F, 2, 4, 3, 0.0F, false));

        this.Rfoot = new AdvancedModelRendererExtended(this);
        this.Rfoot.setRotationPoint(0.0F, 4.7F, -1.0F);
        this.Rleg3.addChild(Rfoot);
        this.setRotateAngle(Rfoot, 0.1745F, 0.0F, 0.0F);
        this.Rfoot.cubeList.add(new ModelBox(Rfoot, 19, 59, -1.0F, -1.8119F, -1.7687F, 3, 2, 3, 0.0F, false));

        this.toe = new AdvancedModelRendererExtended(this);
        this.toe.setRotationPoint(0.5F, -0.8119F, -1.7687F);
        this.Rfoot.addChild(toe);
        this.toe.cubeList.add(new ModelBox(toe, 56, 5, -1.5F, -1.0F, -2.0F, 3, 2, 3, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.bone12.render(f5 * 1.0F);
    }
    
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();

        //this.chest.render(0.01F);

        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        //super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
        this.bone12.offsetY = 0.00F;
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        this.resetToDefaultPose();

        EntityPrehistoricFloraPiatnitzkysaurus entity = (EntityPrehistoricFloraPiatnitzkysaurus) entitylivingbaseIn;
        if (entity.getIsFast()) {
            //Running anim:

        }
        else {
            //Walking anim:
            animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }

        animate((IAnimatedEntity) entity);

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPiatnitzkysaurus entity = (EntityPrehistoricFloraPiatnitzkysaurus) entitylivingbaseIn;

        int animCycle = 60;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -2.5D + (((tickAnim - 0D) / 10D) * 10D);
            yy = 0D + (((tickAnim - 0D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 10D) * 0D);
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 7.5D + (((tickAnim - 10D) / 20D) * -10D);
            yy = 0D + (((tickAnim - 10D) / 20D) * 0D);
            zz = 0D + (((tickAnim - 10D) / 20D) * 0D);
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -2.5D + (((tickAnim - 30D) / 10D) * 10D);
            yy = 0D + (((tickAnim - 30D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 30D) / 10D) * 0D);
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 7.5D + (((tickAnim - 40D) / 20D) * -10D);
            yy = 0D + (((tickAnim - 40D) / 20D) * 0D);
            zz = 0D + (((tickAnim - 40D) / 20D) * 0D);
        }


        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -2.51256D + (((tickAnim - 0D) / 30D) * 0.0221800000000001D);
            yy = -2.92578D + (((tickAnim - 0D) / 30D) * 8.23331D);
            zz = 4.76379D + (((tickAnim - 0D) / 30D) * -8.06349D);
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -2.49038D + (((tickAnim - 30D) / 30D) * -0.0221800000000001D);
            yy = 5.30753D + (((tickAnim - 30D) / 30D) * -8.23331D);
            zz = -3.2997D + (((tickAnim - 30D) / 30D) * 8.06349D);
        }


        this.setRotateAngle(back, back.rotateAngleX + (float) Math.toRadians(xx), back.rotateAngleY + (float) Math.toRadians(yy), back.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 5D + (((tickAnim - 0D) / 10D) * -5D);
            yy = 0D + (((tickAnim - 0D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 10D) * 0D);
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 10D) / 20D) * 5D);
            yy = 0D + (((tickAnim - 10D) / 20D) * 0D);
            zz = 0D + (((tickAnim - 10D) / 20D) * 0D);
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 5D + (((tickAnim - 30D) / 10D) * -5D);
            yy = 0D + (((tickAnim - 30D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 30D) / 10D) * 0D);
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0D + (((tickAnim - 40D) / 20D) * 5D);
            yy = 0D + (((tickAnim - 40D) / 20D) * 0D);
            zz = 0D + (((tickAnim - 40D) / 20D) * 0D);
        }


        this.setRotateAngle(shoulders, shoulders.rotateAngleX + (float) Math.toRadians(xx), shoulders.rotateAngleY + (float) Math.toRadians(yy), shoulders.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 2.5D + (((tickAnim - 0D) / 10D) * -5D);
            yy = 0D + (((tickAnim - 0D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 10D) * 0D);
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = -2.5D + (((tickAnim - 10D) / 20D) * 5D);
            yy = 0D + (((tickAnim - 10D) / 20D) * 0D);
            zz = 0D + (((tickAnim - 10D) / 20D) * 0D);
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 2.5D + (((tickAnim - 30D) / 10D) * -5D);
            yy = 0D + (((tickAnim - 30D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 30D) / 10D) * 0D);
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -2.5D + (((tickAnim - 40D) / 20D) * 5D);
            yy = 0D + (((tickAnim - 40D) / 20D) * 0D);
            zz = 0D + (((tickAnim - 40D) / 20D) * 0D);
        }


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -2.5D + (((tickAnim - 0D) / 10D) * -2.5D);
            yy = 0D + (((tickAnim - 0D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 10D) * 0D);
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = -5D + (((tickAnim - 10D) / 20D) * 2.5D);
            yy = 0D + (((tickAnim - 10D) / 20D) * 0D);
            zz = 0D + (((tickAnim - 10D) / 20D) * 0D);
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -2.5D + (((tickAnim - 30D) / 10D) * -2.5D);
            yy = 0D + (((tickAnim - 30D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 30D) / 10D) * 0D);
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -5D + (((tickAnim - 40D) / 20D) * 2.5D);
            yy = 0D + (((tickAnim - 40D) / 20D) * 0D);
            zz = 0D + (((tickAnim - 40D) / 20D) * 0D);
        }


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 5D + (((tickAnim - 0D) / 10D) * -7.4807D);
            yy = 0D + (((tickAnim - 0D) / 10D) * 2.30959D);
            zz = 0D + (((tickAnim - 0D) / 10D) * 0.95723D);
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = -2.4807D + (((tickAnim - 10D) / 20D) * 7.4807D);
            yy = 2.30959D + (((tickAnim - 10D) / 20D) * -2.30959D);
            zz = 0.95723D + (((tickAnim - 10D) / 20D) * -0.95723D);
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 5D + (((tickAnim - 30D) / 10D) * -7.4807D);
            yy = 0D + (((tickAnim - 30D) / 10D) * -2.30959D);
            zz = 0D + (((tickAnim - 30D) / 10D) * -0.95723D);
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -2.4807D + (((tickAnim - 40D) / 20D) * 7.4807D);
            yy = -2.30959D + (((tickAnim - 40D) / 20D) * 2.30959D);
            zz = -0.95723D + (((tickAnim - 40D) / 20D) * 0.95723D);
        }


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -2.50706D + (((tickAnim - 0D) / 10D) * 2.50706D);
            yy = 0.32621D + (((tickAnim - 0D) / 10D) * -0.32621D);
            zz = -2.47864D + (((tickAnim - 0D) / 10D) * 2.47864D);
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 10D) / 20D) * -2.50706D);
            yy = 0D + (((tickAnim - 10D) / 20D) * -0.32621D);
            zz = 0D + (((tickAnim - 10D) / 20D) * 2.47864D);
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -2.50706D + (((tickAnim - 30D) / 10D) * 2.50706D);
            yy = -0.32621D + (((tickAnim - 30D) / 10D) * 0.32621D);
            zz = 2.47864D + (((tickAnim - 30D) / 10D) * -2.47864D);
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0D + (((tickAnim - 40D) / 20D) * -2.50706D);
            yy = 0D + (((tickAnim - 40D) / 20D) * 0.32621D);
            zz = 0D + (((tickAnim - 40D) / 20D) * -2.47864D);
        }


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 7.5D + (((tickAnim - 0D) / 10D) * -7.5D);
            yy = 0D + (((tickAnim - 0D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 10D) * 0D);
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 10D) / 20D) * 7.5D);
            yy = 0D + (((tickAnim - 10D) / 20D) * 0D);
            zz = 0D + (((tickAnim - 10D) / 20D) * 0D);
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 7.5D + (((tickAnim - 30D) / 10D) * -7.5D);
            yy = 0D + (((tickAnim - 30D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 30D) / 10D) * 0D);
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0D + (((tickAnim - 40D) / 20D) * 7.5D);
            yy = 0D + (((tickAnim - 40D) / 20D) * 0D);
            zz = 0D + (((tickAnim - 40D) / 20D) * 0D);
        }


        this.setRotateAngle(bone49, bone49.rotateAngleX + (float) Math.toRadians(xx), bone49.rotateAngleY + (float) Math.toRadians(yy), bone49.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 15D + (((tickAnim - 0D) / 10D) * -15D);
            yy = 0D + (((tickAnim - 0D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 10D) * 0D);
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 10D) / 20D) * 15D);
            yy = 0D + (((tickAnim - 10D) / 20D) * 0D);
            zz = 0D + (((tickAnim - 10D) / 20D) * 0D);
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 15D + (((tickAnim - 30D) / 10D) * -15D);
            yy = 0D + (((tickAnim - 30D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 30D) / 10D) * 0D);
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0D + (((tickAnim - 40D) / 20D) * 15D);
            yy = 0D + (((tickAnim - 40D) / 20D) * 0D);
            zz = 0D + (((tickAnim - 40D) / 20D) * 0D);
        }



        this.setRotateAngle(bone50, bone50.rotateAngleX + (float) Math.toRadians(xx), bone50.rotateAngleY + (float) Math.toRadians(yy), bone50.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 7.5D + (((tickAnim - 0D) / 10D) * -7.5D);
            yy = 0D + (((tickAnim - 0D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 10D) * 0D);
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 10D) / 20D) * 7.5D);
            yy = 0D + (((tickAnim - 10D) / 20D) * 0D);
            zz = 0D + (((tickAnim - 10D) / 20D) * 0D);
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 7.5D + (((tickAnim - 30D) / 10D) * -7.5D);
            yy = 0D + (((tickAnim - 30D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 30D) / 10D) * 0D);
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0D + (((tickAnim - 40D) / 20D) * 7.5D);
            yy = 0D + (((tickAnim - 40D) / 20D) * 0D);
            zz = 0D + (((tickAnim - 40D) / 20D) * 0D);
        }


        this.setRotateAngle(bone13, bone13.rotateAngleX + (float) Math.toRadians(xx), bone13.rotateAngleY + (float) Math.toRadians(yy), bone13.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 15D + (((tickAnim - 0D) / 10D) * -15D);
            yy = 0D + (((tickAnim - 0D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 10D) * 0D);
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 10D) / 20D) * 15D);
            yy = 0D + (((tickAnim - 10D) / 20D) * 0D);
            zz = 0D + (((tickAnim - 10D) / 20D) * 0D);
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 15D + (((tickAnim - 30D) / 10D) * -12.5D);
            yy = 0D + (((tickAnim - 30D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 30D) / 10D) * 0D);
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 2.5D + (((tickAnim - 40D) / 20D) * 12.5D);
            yy = 0D + (((tickAnim - 40D) / 20D) * 0D);
            zz = 0D + (((tickAnim - 40D) / 20D) * 0D);
        }


        this.setRotateAngle(bone14, bone14.rotateAngleX + (float) Math.toRadians(xx), bone14.rotateAngleY + (float) Math.toRadians(yy), bone14.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 0D) / 13D) * 7.48869D);
            yy = 0D + (((tickAnim - 0D) / 13D) * 7.51132D);
            zz = 0D + (((tickAnim - 0D) / 13D) * 0.55182D);
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 7.48869D + (((tickAnim - 13D) / 17D) * -7.48869D);
            yy = 7.51132D + (((tickAnim - 13D) / 17D) * -7.51132D);
            zz = 0.55182D + (((tickAnim - 13D) / 17D) * -0.55182D);
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = 0D + (((tickAnim - 30D) / 13D) * 7.49295D);
            yy = 0D + (((tickAnim - 30D) / 13D) * -2.51646D);
            zz = 0D + (((tickAnim - 30D) / 13D) * -0.1116D);
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 7.49295D + (((tickAnim - 43D) / 17D) * -7.49295D);
            yy = -2.51646D + (((tickAnim - 43D) / 17D) * 2.51646D);
            zz = -0.1116D + (((tickAnim - 43D) / 17D) * 0.1116D);
        }


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -7.5D + (((tickAnim - 0D) / 13D) * 5D);
            yy = 0D + (((tickAnim - 0D) / 13D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 13D) * 0D);
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = -2.5D + (((tickAnim - 13D) / 17D) * -5D);
            yy = 0D + (((tickAnim - 13D) / 17D) * 0D);
            zz = 0D + (((tickAnim - 13D) / 17D) * 0D);
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = -7.5D + (((tickAnim - 30D) / 13D) * 8.51256D);
            yy = 0D + (((tickAnim - 30D) / 13D) * -2.99552D);
            zz = 0D + (((tickAnim - 30D) / 13D) * -0.18355D);
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 1.01256D + (((tickAnim - 43D) / 17D) * -8.51256D);
            yy = -2.99552D + (((tickAnim - 43D) / 17D) * 2.99552D);
            zz = -0.18355D + (((tickAnim - 43D) / 17D) * 0.18355D);
        }


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -5D + (((tickAnim - 0D) / 13D) * 0.0598999999999998D);
            yy = 0D + (((tickAnim - 0D) / 13D) * 5.00509D);
            zz = 0D + (((tickAnim - 0D) / 13D) * 0.72042D);
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = -4.9401D + (((tickAnim - 13D) / 17D) * -0.0598999999999998D);
            yy = 5.00509D + (((tickAnim - 13D) / 17D) * -5.00509D);
            zz = 0.72042D + (((tickAnim - 13D) / 17D) * -0.72042D);
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = -5D + (((tickAnim - 30D) / 13D) * 0.0244600000000004D);
            yy = 0D + (((tickAnim - 30D) / 13D) * -2.49883D);
            zz = 0D + (((tickAnim - 30D) / 13D) * -0.4686D);
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = -4.97554D + (((tickAnim - 43D) / 17D) * -0.0244600000000004D);
            yy = -2.49883D + (((tickAnim - 43D) / 17D) * 2.49883D);
            zz = -0.4686D + (((tickAnim - 43D) / 17D) * 0.4686D);
        }


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 0D) / 13D) * -2.53598D);
            yy = 0D + (((tickAnim - 0D) / 13D) * 4.92981D);
            zz = 0D + (((tickAnim - 0D) / 13D) * -0.83591D);
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -2.53598D + (((tickAnim - 13D) / 7D) * 3.33905D);
            yy = 4.92981D + (((tickAnim - 13D) / 7D) * -2.87595D);
            zz = -0.83591D + (((tickAnim - 13D) / 7D) * 0.485D);
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0.80307D + (((tickAnim - 20D) / 10D) * -0.80307D);
            yy = 2.05386D + (((tickAnim - 20D) / 10D) * -2.05386D);
            zz = -0.35091D + (((tickAnim - 20D) / 10D) * 0.35091D);
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = 0D + (((tickAnim - 30D) / 13D) * -0.03598D);
            yy = 0D + (((tickAnim - 30D) / 13D) * -4.92981D);
            zz = 0D + (((tickAnim - 30D) / 13D) * 0.83591D);
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -0.03598D + (((tickAnim - 43D) / 7D) * 1.38828D);
            yy = -4.92981D + (((tickAnim - 43D) / 7D) * 4.41627D);
            zz = 0.83591D + (((tickAnim - 43D) / 7D) * -0.749D);
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 1.3523D + (((tickAnim - 50D) / 10D) * -1.3523D);
            yy = -0.51354D + (((tickAnim - 50D) / 10D) * 0.51354D);
            zz = 0.08691D + (((tickAnim - 50D) / 10D) * -0.08691D);
        }


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 2.5D + (((tickAnim - 0D) / 13D) * -4.65588D);
            yy = 0D + (((tickAnim - 0D) / 13D) * 2.98262D);
            zz = 0D + (((tickAnim - 0D) / 13D) * 2.40249D);
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -2.15588D + (((tickAnim - 13D) / 7D) * 14.63832D);
            yy = 2.98262D + (((tickAnim - 13D) / 7D) * -0.38333D);
            zz = 2.40249D + (((tickAnim - 13D) / 7D) * -2.56311D);
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 12.48244D + (((tickAnim - 20D) / 10D) * -9.98244D);
            yy = 2.59929D + (((tickAnim - 20D) / 10D) * -2.59929D);
            zz = -0.16062D + (((tickAnim - 20D) / 10D) * 0.16062D);
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = 2.5D + (((tickAnim - 30D) / 13D) * -4.89599D);
            yy = 0D + (((tickAnim - 30D) / 13D) * -2.61765D);
            zz = 0D + (((tickAnim - 30D) / 13D) * -0.81971D);
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -2.39599D + (((tickAnim - 43D) / 7D) * 16.34317D);
            yy = -2.61765D + (((tickAnim - 43D) / 7D) * 0.5382D);
            zz = -0.81971D + (((tickAnim - 43D) / 7D) * 0.94746D);
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 13.94718D + (((tickAnim - 50D) / 10D) * -11.44718D);
            yy = -2.07945D + (((tickAnim - 50D) / 10D) * 2.07945D);
            zz = 0.12775D + (((tickAnim - 50D) / 10D) * -0.12775D);
        }


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 17.5D + (((tickAnim - 0D) / 4D) * 0.59D);
            yy = 0D + (((tickAnim - 0D) / 4D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 4D) * 0D);
        }
        else if (tickAnim >= 4 && tickAnim < 14) {
            xx = 18.09D + (((tickAnim - 4D) / 10D) * -34.41D);
            yy = 0D + (((tickAnim - 4D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 4D) / 10D) * 0D);
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = -16.32D + (((tickAnim - 14D) / 16D) * 3.82D);
            yy = 0D + (((tickAnim - 14D) / 16D) * 0D);
            zz = 0D + (((tickAnim - 14D) / 16D) * 0D);
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -12.5D + (((tickAnim - 30D) / 20D) * 20.83D);
            yy = 0D + (((tickAnim - 30D) / 20D) * 0D);
            zz = 0D + (((tickAnim - 30D) / 20D) * 0D);
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 8.33D + (((tickAnim - 50D) / 10D) * 9.17D);
            yy = 0D + (((tickAnim - 50D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 50D) / 10D) * 0D);
        }


        this.setRotateAngle(Lleg1, Lleg1.rotateAngleX + (float) Math.toRadians(xx), Lleg1.rotateAngleY + (float) Math.toRadians(yy), Lleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 20.42D + (((tickAnim - 0D) / 4D) * -5.42D);
            yy = 0D + (((tickAnim - 0D) / 4D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 4D) * 0D);
        }
        else if (tickAnim >= 4 && tickAnim < 14) {
            xx = 15D + (((tickAnim - 4D) / 10D) * -4.33D);
            yy = 0D + (((tickAnim - 4D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 4D) / 10D) * 0D);
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 10.67D + (((tickAnim - 14D) / 16D) * -18.17D);
            yy = 0D + (((tickAnim - 14D) / 16D) * 0D);
            zz = 0D + (((tickAnim - 14D) / 16D) * 0D);
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -7.5D + (((tickAnim - 30D) / 20D) * 18.17D);
            yy = 0D + (((tickAnim - 30D) / 20D) * 0D);
            zz = 0D + (((tickAnim - 30D) / 20D) * 0D);
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 10.67D + (((tickAnim - 50D) / 10D) * 9.75D);
            yy = 0D + (((tickAnim - 50D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 50D) / 10D) * 0D);
        }


        this.setRotateAngle(Lleg2, Lleg2.rotateAngleX + (float) Math.toRadians(xx), Lleg2.rotateAngleY + (float) Math.toRadians(yy), Lleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 1.94D + (((tickAnim - 0D) / 4D) * -46.11D);
            yy = 0D + (((tickAnim - 0D) / 4D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 4D) * 0D);
        }
        else if (tickAnim >= 4 && tickAnim < 14) {
            xx = -44.17D + (((tickAnim - 4D) / 10D) * -1.66D);
            yy = 0D + (((tickAnim - 4D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 4D) / 10D) * 0D);
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = -45.83D + (((tickAnim - 14D) / 16D) * 55.83D);
            yy = 0D + (((tickAnim - 14D) / 16D) * 0D);
            zz = 0D + (((tickAnim - 14D) / 16D) * 0D);
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 10D + (((tickAnim - 30D) / 20D) * -10.1D);
            yy = 0D + (((tickAnim - 30D) / 20D) * 0D);
            zz = 0D + (((tickAnim - 30D) / 20D) * 0D);
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -0.1D + (((tickAnim - 50D) / 10D) * 2.04D);
            yy = 0D + (((tickAnim - 50D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 50D) / 10D) * 0D);
        }


        this.setRotateAngle(Lleg3, Lleg3.rotateAngleX + (float) Math.toRadians(xx), Lleg3.rotateAngleY + (float) Math.toRadians(yy), Lleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 62.19D + (((tickAnim - 0D) / 4D) * -5.52D);
            yy = 0D + (((tickAnim - 0D) / 4D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 4D) * 0D);
        }
        else if (tickAnim >= 4 && tickAnim < 14) {
            xx = 56.67D + (((tickAnim - 4D) / 10D) * 40.77D);
            yy = 0D + (((tickAnim - 4D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 4D) / 10D) * 0D);
        }
        else if (tickAnim >= 14 && tickAnim < 24) {
            xx = 97.44D + (((tickAnim - 14D) / 10D) * -49.97D);
            yy = 0D + (((tickAnim - 14D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 14D) / 10D) * 0D);
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 47.47D + (((tickAnim - 24D) / 6D) * -37.47D);
            yy = 0D + (((tickAnim - 24D) / 6D) * 0D);
            zz = 0D + (((tickAnim - 24D) / 6D) * 0D);
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 10D + (((tickAnim - 30D) / 10D) * -6.67D);
            yy = 0D + (((tickAnim - 30D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 30D) / 10D) * 0D);
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 3.33D + (((tickAnim - 40D) / 10D) * 9.67D);
            yy = 0D + (((tickAnim - 40D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 40D) / 10D) * 0D);
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 13D + (((tickAnim - 50D) / 10D) * 49.19D);
            yy = 0D + (((tickAnim - 50D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 50D) / 10D) * 0D);
        }


        this.setRotateAngle(Lfoot, Lfoot.rotateAngleX + (float) Math.toRadians(xx), Lfoot.rotateAngleY + (float) Math.toRadians(yy), Lfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -10D + (((tickAnim - 0D) / 20D) * 18.33D);
            yy = 0D + (((tickAnim - 0D) / 20D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 20D) * 0D);
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 8.33D + (((tickAnim - 20D) / 10D) * 9.17D);
            yy = 0D + (((tickAnim - 20D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 20D) / 10D) * 0D);
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 17.5D + (((tickAnim - 30D) / 4D) * 0.59D);
            yy = 0D + (((tickAnim - 30D) / 4D) * 0D);
            zz = 0D + (((tickAnim - 30D) / 4D) * 0D);
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 18.09D + (((tickAnim - 34D) / 16D) * -34.41D);
            yy = 0D + (((tickAnim - 34D) / 16D) * 0D);
            zz = 0D + (((tickAnim - 34D) / 16D) * 0D);
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -16.32D + (((tickAnim - 50D) / 10D) * 6.32D);
            yy = 0D + (((tickAnim - 50D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 50D) / 10D) * 0D);
        }


        this.setRotateAngle(Rleg1, Rleg1.rotateAngleX + (float) Math.toRadians(xx), Rleg1.rotateAngleY + (float) Math.toRadians(yy), Rleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -5D + (((tickAnim - 0D) / 10D) * 10D);
            yy = 0D + (((tickAnim - 0D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 10D) * 0D);
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 5D + (((tickAnim - 10D) / 10D) * 5.67D);
            yy = 0D + (((tickAnim - 10D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 10D) / 10D) * 0D);
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 10.67D + (((tickAnim - 20D) / 10D) * 9.75D);
            yy = 0D + (((tickAnim - 20D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 20D) / 10D) * 0D);
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 20.42D + (((tickAnim - 30D) / 4D) * 0D);
            yy = 0D + (((tickAnim - 30D) / 4D) * 0D);
            zz = 0D + (((tickAnim - 30D) / 4D) * 0D);
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 20.42D + (((tickAnim - 34D) / 16D) * -9.75D);
            yy = 0D + (((tickAnim - 34D) / 16D) * 0D);
            zz = 0D + (((tickAnim - 34D) / 16D) * 0D);
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 10.67D + (((tickAnim - 50D) / 10D) * -15.67D);
            yy = 0D + (((tickAnim - 50D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 50D) / 10D) * 0D);
        }


        this.setRotateAngle(Rleg2, Rleg2.rotateAngleX + (float) Math.toRadians(xx), Rleg2.rotateAngleY + (float) Math.toRadians(yy), Rleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 7.5D + (((tickAnim - 0D) / 10D) * -4.17D);
            yy = 0D + (((tickAnim - 0D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 10D) * 0D);
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 3.33D + (((tickAnim - 10D) / 10D) * -3.43D);
            yy = 0D + (((tickAnim - 10D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 10D) / 10D) * 0D);
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -0.1D + (((tickAnim - 20D) / 4D) * -2.4D);
            yy = 0D + (((tickAnim - 20D) / 4D) * 0D);
            zz = 0D + (((tickAnim - 20D) / 4D) * 0D);
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -2.5D + (((tickAnim - 24D) / 6D) * 4.44D);
            yy = 0D + (((tickAnim - 24D) / 6D) * 0D);
            zz = 0D + (((tickAnim - 24D) / 6D) * 0D);
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 1.94D + (((tickAnim - 30D) / 4D) * -46.11D);
            yy = 0D + (((tickAnim - 30D) / 4D) * 0D);
            zz = 0D + (((tickAnim - 30D) / 4D) * 0D);
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -44.17D + (((tickAnim - 34D) / 16D) * -1.66D);
            yy = 0D + (((tickAnim - 34D) / 16D) * 0D);
            zz = 0D + (((tickAnim - 34D) / 16D) * 0D);
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -45.83D + (((tickAnim - 50D) / 10D) * 53.33D);
            yy = 0D + (((tickAnim - 50D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 50D) / 10D) * 0D);
        }


        this.setRotateAngle(Rleg3, Rleg3.rotateAngleX + (float) Math.toRadians(xx), Rleg3.rotateAngleY + (float) Math.toRadians(yy), Rleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 10D + (((tickAnim - 0D) / 10D) * -6.67D);
            yy = 0D + (((tickAnim - 0D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 10D) * 0D);
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 3.33D + (((tickAnim - 10D) / 10D) * 9.67D);
            yy = 0D + (((tickAnim - 10D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 10D) / 10D) * 0D);
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 13D + (((tickAnim - 20D) / 4D) * 19.5D);
            yy = 0D + (((tickAnim - 20D) / 4D) * 0D);
            zz = 0D + (((tickAnim - 20D) / 4D) * 0D);
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 32.5D + (((tickAnim - 24D) / 6D) * 29.69D);
            yy = 0D + (((tickAnim - 24D) / 6D) * 0D);
            zz = 0D + (((tickAnim - 24D) / 6D) * 0D);
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 62.19D + (((tickAnim - 30D) / 10D) * -0.519999999999996D);
            yy = 0D + (((tickAnim - 30D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 30D) / 10D) * 0D);
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 61.67D + (((tickAnim - 40D) / 10D) * 30.77D);
            yy = 0D + (((tickAnim - 40D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 40D) / 10D) * 0D);
        }
        else if (tickAnim >= 50 && tickAnim < 54) {
            xx = 92.44D + (((tickAnim - 50D) / 4D) * -37.48D);
            yy = 0D + (((tickAnim - 50D) / 4D) * 0D);
            zz = 0D + (((tickAnim - 50D) / 4D) * 0D);
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = 54.96D + (((tickAnim - 54D) / 6D) * -44.96D);
            yy = 0D + (((tickAnim - 54D) / 6D) * 0D);
            zz = 0D + (((tickAnim - 54D) / 6D) * 0D);
        }


        this.setRotateAngle(Rfoot, Rfoot.rotateAngleX + (float) Math.toRadians(xx), Rfoot.rotateAngleY + (float) Math.toRadians(yy), Rfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -5D + (((tickAnim - 0D) / 20D) * -25D);
            yy = 0D + (((tickAnim - 0D) / 20D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 20D) * 0D);
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -30D + (((tickAnim - 20D) / 5D) * -28.23D);
            yy = 0D + (((tickAnim - 20D) / 5D) * 0D);
            zz = 0D + (((tickAnim - 20D) / 5D) * 0D);
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -58.23D + (((tickAnim - 25D) / 5D) * -5.73D);
            yy = 0D + (((tickAnim - 25D) / 5D) * 0D);
            zz = 0D + (((tickAnim - 25D) / 5D) * 0D);
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = -63.96D + (((tickAnim - 30D) / 4D) * 71.46D);
            yy = 0D + (((tickAnim - 30D) / 4D) * 0D);
            zz = 0D + (((tickAnim - 30D) / 4D) * 0D);
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 7.5D + (((tickAnim - 34D) / 16D) * 42.5D);
            yy = 0D + (((tickAnim - 34D) / 16D) * 0D);
            zz = 0D + (((tickAnim - 34D) / 16D) * 0D);
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 50D + (((tickAnim - 50D) / 10D) * -55D);
            yy = 0D + (((tickAnim - 50D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 50D) / 10D) * 0D);
        }


        this.setRotateAngle(toe, toe.rotateAngleX + (float) Math.toRadians(xx), toe.rotateAngleY + (float) Math.toRadians(yy), toe.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -63.96D + (((tickAnim - 0D) / 4D) * 71.46D);
            yy = 0D + (((tickAnim - 0D) / 4D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 4D) * 0D);
        }
        else if (tickAnim >= 4 && tickAnim < 14) {
            xx = 7.5D + (((tickAnim - 4D) / 10D) * 42.5D);
            yy = 0D + (((tickAnim - 4D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 4D) / 10D) * 0D);
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 50D + (((tickAnim - 14D) / 16D) * -55D);
            yy = 0D + (((tickAnim - 14D) / 16D) * 0D);
            zz = 0D + (((tickAnim - 14D) / 16D) * 0D);
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -5D + (((tickAnim - 30D) / 20D) * -25D);
            yy = 0D + (((tickAnim - 30D) / 20D) * 0D);
            zz = 0D + (((tickAnim - 30D) / 20D) * 0D);
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = -30D + (((tickAnim - 50D) / 5D) * -28.23D);
            yy = 0D + (((tickAnim - 50D) / 5D) * 0D);
            zz = 0D + (((tickAnim - 50D) / 5D) * 0D);
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -58.23D + (((tickAnim - 55D) / 5D) * -5.73D);
            yy = 0D + (((tickAnim - 55D) / 5D) * 0D);
            zz = 0D + (((tickAnim - 55D) / 5D) * 0D);
        }


        this.setRotateAngle(bone20, bone20.rotateAngleX + (float) Math.toRadians(xx), bone20.rotateAngleY + (float) Math.toRadians(yy), bone20.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * 2.5D);
            yy = 0D + (((tickAnim - 0D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 10D) * 0D);
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 2.5D + (((tickAnim - 10D) / 20D) * -2.5D);
            yy = 0D + (((tickAnim - 10D) / 20D) * 0D);
            zz = 0D + (((tickAnim - 10D) / 20D) * 0D);
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 30D) / 10D) * 2.5D);
            yy = 0D + (((tickAnim - 30D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 30D) / 10D) * 0D);
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 2.5D + (((tickAnim - 40D) / 20D) * -2.5D);
            yy = 0D + (((tickAnim - 40D) / 20D) * 0D);
            zz = 0D + (((tickAnim - 40D) / 20D) * 0D);
        }

        this.setRotateAngle(lowerjaw, lowerjaw.rotateAngleX + (float) Math.toRadians(xx), lowerjaw.rotateAngleY + (float) Math.toRadians(yy), lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));

    }


    public void animate(IAnimatedEntity entity) {
        EntityPrehistoricFloraPiatnitzkysaurus e = (EntityPrehistoricFloraPiatnitzkysaurus) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        //setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(neck, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck3, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(head, (float) Math.toRadians(-50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(lowerjaw, (float) Math.toRadians(60), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
