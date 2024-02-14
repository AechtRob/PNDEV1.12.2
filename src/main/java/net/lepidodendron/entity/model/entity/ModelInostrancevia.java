package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraInostrancevia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelInostrancevia extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer tail2_r1;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer hips_r1;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftarm;
    private final AdvancedModelRenderer leftarm2;
    private final AdvancedModelRenderer lefthand;
    private final AdvancedModelRenderer leftfronttoe;
    private final AdvancedModelRenderer rightarm;
    private final AdvancedModelRenderer rightarm2;
    private final AdvancedModelRenderer righthand;
    private final AdvancedModelRenderer rightfronttoe;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer upperjawteeth_r1;
    private final AdvancedModelRenderer rightsabre_r1;
    private final AdvancedModelRenderer upperjawteeth2_r1;
    private final AdvancedModelRenderer head_r1;
    private final AdvancedModelRenderer head_r2;
    private final AdvancedModelRenderer upperjaw2_r1;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer lowerjaw5_r1;
    private final AdvancedModelRenderer lowerjaw4_r1;
    private final AdvancedModelRenderer lowerjawteeth3_r1;
    private final AdvancedModelRenderer lowerjaw2_r1;
    private final AdvancedModelRenderer lowerjaw2_r2;
    private final AdvancedModelRenderer lowerjaw3_r1;
    private final AdvancedModelRenderer lowerjaw2_r3;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer leftthigh_r1;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer leftfoot;
    private final AdvancedModelRenderer leftbacktoe;
    private final AdvancedModelRenderer rightleg;
    private final AdvancedModelRenderer rightthigh_r1;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer rightfoot;
    private final AdvancedModelRenderer rightbacktoe;

    private ModelAnimator animator;

    public ModelInostrancevia() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 3.329F, 12.8436F);
        this.setRotateAngle(hips, -0.2182F, 0.0F, 0.0F);


        this.tail2_r1 = new AdvancedModelRenderer(this);
        this.tail2_r1.setRotationPoint(0.0F, 1.5F, 4.0F);
        this.hips.addChild(tail2_r1);
        this.setRotateAngle(tail2_r1, -0.1309F, 0.0F, 0.0F);
        this.tail2_r1.cubeList.add(new ModelBox(tail2_r1, 30, 49, -3.5F, -2.45F, -5.5F, 7, 10, 10, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.879F, -1.3436F);
        this.hips.addChild(body2);
        this.setRotateAngle(body2, 0.0436F, 0.0F, 0.0F);


        this.hips_r1 = new AdvancedModelRenderer(this);
        this.hips_r1.setRotationPoint(0.0F, 5.5061F, -0.1204F);
        this.body2.addChild(hips_r1);
        this.setRotateAngle(hips_r1, 0.0262F, 0.0F, 0.0F);
        this.hips_r1.cubeList.add(new ModelBox(hips_r1, 40, 27, -5.0F, -6.5F, -8.25F, 10, 13, 9, -0.003F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.95F, -8.5F);
        this.body2.addChild(body);
        this.setRotateAngle(body, 0.1833F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -6.0F, -1.8914F, -12.5958F, 12, 14, 13, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.4086F, -12.1958F);
        this.body.addChild(chest);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, 5.3F, -3.4F);
        this.chest.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 27, -5.5F, -7.0F, -5.0F, 10, 13, 10, 0.0F, false));

        this.leftarm = new AdvancedModelRenderer(this);
        this.leftarm.setRotationPoint(4.0F, 8.5225F, -4.6507F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, 0.2577F, 0.2148F, -0.0385F);
        this.leftarm.cubeList.add(new ModelBox(leftarm, 0, 68, -1.0F, -2.5F, -3.25F, 5, 8, 6, 0.0F, false));

        this.leftarm2 = new AdvancedModelRenderer(this);
        this.leftarm2.setRotationPoint(0.7834F, 5.1515F, 0.0F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -0.2711F, -0.1974F, 0.0934F);
        this.leftarm2.cubeList.add(new ModelBox(leftarm2, 78, 0, -1.75F, -0.75F, -3.0F, 4, 8, 5, 0.1F, false));

        this.lefthand = new AdvancedModelRenderer(this);
        this.lefthand.setRotationPoint(0.2345F, 6.4344F, -0.4973F);
        this.leftarm2.addChild(lefthand);
        this.lefthand.cubeList.add(new ModelBox(lefthand, 50, 19, -2.5F, 0.0F, -3.0F, 5, 2, 4, 0.0F, false));

        this.leftfronttoe = new AdvancedModelRenderer(this);
        this.leftfronttoe.setRotationPoint(0.0F, 1.0F, -3.0F);
        this.lefthand.addChild(leftfronttoe);
        this.leftfronttoe.cubeList.add(new ModelBox(leftfronttoe, 82, 76, -2.4999F, -1.0F, -2.0F, 5, 2, 2, 0.0F, false));

        this.rightarm = new AdvancedModelRenderer(this);
        this.rightarm.setRotationPoint(-4.0F, 8.5225F, -4.6507F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.2577F, -0.2148F, 0.0385F);
        this.rightarm.cubeList.add(new ModelBox(rightarm, 0, 68, -4.0F, -2.5F, -3.25F, 5, 8, 6, 0.0F, true));

        this.rightarm2 = new AdvancedModelRenderer(this);
        this.rightarm2.setRotationPoint(-0.7834F, 5.1515F, 0.0F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -0.2711F, 0.1974F, -0.0934F);
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 78, 0, -2.25F, -0.75F, -3.0F, 4, 8, 5, 0.1F, true));

        this.righthand = new AdvancedModelRenderer(this);
        this.righthand.setRotationPoint(-0.2345F, 6.4344F, -0.4973F);
        this.rightarm2.addChild(righthand);
        this.righthand.cubeList.add(new ModelBox(righthand, 50, 19, -2.5F, 0.0F, -3.0F, 5, 2, 4, 0.0F, true));

        this.rightfronttoe = new AdvancedModelRenderer(this);
        this.rightfronttoe.setRotationPoint(0.0F, 1.0F, -3.0F);
        this.righthand.addChild(rightfronttoe);
        this.rightfronttoe.cubeList.add(new ModelBox(rightfronttoe, 82, 76, -2.5001F, -1.0F, -2.0F, 5, 2, 2, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 1.5248F, -7.952F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.4363F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 0, 50, -3.0F, -2.3803F, -4.747F, 6, 9, 9, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.5803F, -4.297F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, 0.2182F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 69, 19, -2.5F, -1.6675F, -5.407F, 5, 8, 6, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 1.9825F, -5.157F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.3927F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 78, 33, -2.0F, -3.6114F, -4.8152F, 4, 4, 6, 0.0F, false));

        this.upperjawteeth_r1 = new AdvancedModelRenderer(this);
        this.upperjawteeth_r1.setRotationPoint(0.0F, -0.1251F, -12.9304F);
        this.head.addChild(upperjawteeth_r1);
        this.setRotateAngle(upperjawteeth_r1, 0.0436F, 0.0F, 0.0F);
        this.upperjawteeth_r1.cubeList.add(new ModelBox(upperjawteeth_r1, 0, 5, -1.5F, 0.0827F, -0.2835F, 3, 2, 2, -0.15F, false));

        this.rightsabre_r1 = new AdvancedModelRenderer(this);
        this.rightsabre_r1.setRotationPoint(0.3F, 0.0111F, -10.9323F);
        this.head.addChild(rightsabre_r1);
        this.setRotateAngle(rightsabre_r1, 0.0873F, 0.0F, 0.0F);
        this.rightsabre_r1.cubeList.add(new ModelBox(rightsabre_r1, 30, 27, -2.55F, 0.3335F, -0.1088F, 1, 3, 1, 0.0F, true));
        this.rightsabre_r1.cubeList.add(new ModelBox(rightsabre_r1, 30, 27, 0.95F, 0.3335F, -0.1088F, 1, 3, 1, 0.0F, false));

        this.upperjawteeth2_r1 = new AdvancedModelRenderer(this);
        this.upperjawteeth2_r1.setRotationPoint(0.3F, 0.0111F, -10.9323F);
        this.head.addChild(upperjawteeth2_r1);
        this.setRotateAngle(upperjawteeth2_r1, 0.0436F, 0.0F, 0.0F);
        this.upperjawteeth2_r1.cubeList.add(new ModelBox(upperjawteeth2_r1, 0, 27, -2.0F, 0.4458F, 1.1434F, 1, 1, 3, 0.0F, true));
        this.upperjawteeth2_r1.cubeList.add(new ModelBox(upperjawteeth2_r1, 0, 27, 0.4F, 0.4458F, 1.1434F, 1, 1, 3, 0.0F, false));
        this.upperjawteeth2_r1.cubeList.add(new ModelBox(upperjawteeth2_r1, 42, 73, -2.8F, -3.228F, -0.4568F, 5, 4, 7, 0.1F, false));

        this.head_r1 = new AdvancedModelRenderer(this);
        this.head_r1.setRotationPoint(-2.5F, -1.6114F, -4.9152F);
        this.head.addChild(head_r1);
        this.setRotateAngle(head_r1, 0.0F, -0.1309F, 0.0F);
        this.head_r1.cubeList.add(new ModelBox(head_r1, 60, 82, -0.4F, -2.0F, 0.0F, 2, 4, 6, 0.002F, true));

        this.head_r2 = new AdvancedModelRenderer(this);
        this.head_r2.setRotationPoint(2.5F, -1.6114F, -4.9152F);
        this.head.addChild(head_r2);
        this.setRotateAngle(head_r2, 0.0F, 0.1309F, 0.0F);
        this.head_r2.cubeList.add(new ModelBox(head_r2, 60, 82, -1.6F, -2.0F, 0.0F, 2, 4, 6, 0.002F, false));

        this.upperjaw2_r1 = new AdvancedModelRenderer(this);
        this.upperjaw2_r1.setRotationPoint(0.0F, -0.1251F, -12.9304F);
        this.head.addChild(upperjaw2_r1);
        this.setRotateAngle(upperjaw2_r1, 0.1309F, 0.0F, 0.0F);
        this.upperjaw2_r1.cubeList.add(new ModelBox(upperjaw2_r1, 60, 73, -2.0F, -2.8074F, -0.1192F, 4, 4, 2, 0.0F, false));
        this.upperjaw2_r1.cubeList.add(new ModelBox(upperjaw2_r1, 0, 0, -2.0F, -2.7672F, -0.9679F, 4, 4, 1, -0.1F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.5986F, -0.7152F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0436F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 37, 0, -2.5F, -0.25F, -4.0F, 5, 3, 5, 0.001F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 66, 73, -2.0F, 3.05F, -7.5F, 4, 1, 8, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 5, 9, -1.5F, -0.04F, -12.4F, 3, 1, 1, -0.1F, false));

        this.lowerjaw5_r1 = new AdvancedModelRenderer(this);
        this.lowerjaw5_r1.setRotationPoint(-0.5F, 2.26F, -11.1F);
        this.jaw.addChild(lowerjaw5_r1);
        this.setRotateAngle(lowerjaw5_r1, 0.0436F, 0.0F, 0.0F);
        this.lowerjaw5_r1.cubeList.add(new ModelBox(lowerjaw5_r1, 78, 13, -1.0F, -1.7F, -1.65F, 3, 1, 4, 0.0F, false));

        this.lowerjaw4_r1 = new AdvancedModelRenderer(this);
        this.lowerjaw4_r1.setRotationPoint(-0.5F, 2.26F, -11.1F);
        this.jaw.addChild(lowerjaw4_r1);
        this.setRotateAngle(lowerjaw4_r1, 0.3491F, 0.0F, 0.0F);
        this.lowerjaw4_r1.cubeList.add(new ModelBox(lowerjaw4_r1, 54, 49, -1.0F, -1.3F, -1.35F, 3, 4, 3, -0.1F, false));

        this.lowerjawteeth3_r1 = new AdvancedModelRenderer(this);
        this.lowerjawteeth3_r1.setRotationPoint(0.0F, 0.31F, -11.4F);
        this.jaw.addChild(lowerjawteeth3_r1);
        this.setRotateAngle(lowerjawteeth3_r1, 0.0436F, 0.0F, 0.0F);
        this.lowerjawteeth3_r1.cubeList.add(new ModelBox(lowerjawteeth3_r1, 37, 0, -1.3F, -1.5F, -0.5F, 1, 3, 1, 0.0F, true));
        this.lowerjawteeth3_r1.cubeList.add(new ModelBox(lowerjawteeth3_r1, 37, 0, 0.3F, -1.5F, -0.5F, 1, 3, 1, 0.0F, false));

        this.lowerjaw2_r1 = new AdvancedModelRenderer(this);
        this.lowerjaw2_r1.setRotationPoint(0.0F, 1.91F, -7.4F);
        this.jaw.addChild(lowerjaw2_r1);
        this.setRotateAngle(lowerjaw2_r1, 0.1309F, 0.0F, 0.0F);
        this.lowerjaw2_r1.cubeList.add(new ModelBox(lowerjaw2_r1, 64, 49, -2.5F, -1.85F, -2.95F, 5, 4, 7, -0.1F, false));

        this.lowerjaw2_r2 = new AdvancedModelRenderer(this);
        this.lowerjaw2_r2.setRotationPoint(0.0F, -0.75F, -1.5F);
        this.jaw.addChild(lowerjaw2_r2);
        this.setRotateAngle(lowerjaw2_r2, -0.4363F, 0.0F, 0.0F);
        this.lowerjaw2_r2.cubeList.add(new ModelBox(lowerjaw2_r2, 30, 27, -2.5F, -2.2F, -1.95F, 5, 4, 4, 0.0F, false));

        this.lowerjaw3_r1 = new AdvancedModelRenderer(this);
        this.lowerjaw3_r1.setRotationPoint(-2.561F, 1.2503F, -1.5695F);
        this.jaw.addChild(lowerjaw3_r1);
        this.setRotateAngle(lowerjaw3_r1, 0.0F, -0.0436F, 0.0F);
        this.lowerjaw3_r1.cubeList.add(new ModelBox(lowerjaw3_r1, 82, 67, -0.2F, -1.25F, -2.5F, 2, 4, 5, 0.0F, false));

        this.lowerjaw2_r3 = new AdvancedModelRenderer(this);
        this.lowerjaw2_r3.setRotationPoint(2.561F, 1.2503F, -1.5695F);
        this.jaw.addChild(lowerjaw2_r3);
        this.setRotateAngle(lowerjaw2_r3, 0.0F, 0.0436F, 0.0F);
        this.lowerjaw2_r3.cubeList.add(new ModelBox(lowerjaw2_r3, 76, 82, -1.8F, -1.25F, -2.5F, 2, 4, 5, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 1.5272F, 7.7316F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.4363F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 56, 61, -2.5F, -1.5272F, -1.2316F, 5, 4, 8, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0228F, 6.2684F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.2182F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 81, 43, -1.5F, -0.9985F, -0.2387F, 3, 3, 7, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1015F, 6.5113F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1309F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 21, 50, -1.0F, -0.6484F, -0.1616F, 2, 2, 6, 0.002F, false));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(3.2465F, 2.4989F, 2.3604F);
        this.hips.addChild(leftleg);
        this.setRotateAngle(leftleg, -0.3013F, -0.2148F, -0.0385F);


        this.leftthigh_r1 = new AdvancedModelRenderer(this);
        this.leftthigh_r1.setRotationPoint(0.7535F, 3.1546F, 1.0489F);
        this.leftleg.addChild(leftthigh_r1);
        this.setRotateAngle(leftthigh_r1, 0.0F, 0.1309F, 0.0F);
        this.leftthigh_r1.cubeList.add(new ModelBox(leftthigh_r1, 50, 0, -3.55F, -5.5F, -4.0F, 6, 11, 8, 0.1F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(0.0535F, 8.2784F, -1.1674F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.5446F, 0.1947F, 0.0986F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 22, 69, -2.8304F, -0.4753F, -0.9824F, 5, 11, 5, 0.2F, false));

        this.leftfoot = new AdvancedModelRenderer(this);
        this.leftfoot.setRotationPoint(-0.0804F, 9.1735F, 1.5951F);
        this.leftleg2.addChild(leftfoot);
        this.leftfoot.cubeList.add(new ModelBox(leftfoot, 74, 60, -3.75F, 0.0F, -3.75F, 7, 2, 5, 0.0F, false));

        this.leftbacktoe = new AdvancedModelRenderer(this);
        this.leftbacktoe.setRotationPoint(-0.25F, 1.0F, -3.75F);
        this.leftfoot.addChild(leftbacktoe);
        this.leftbacktoe.cubeList.add(new ModelBox(leftbacktoe, 37, 69, -3.5002F, -1.0F, -2.0F, 7, 2, 2, 0.0F, false));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-3.2465F, 2.4989F, 2.3604F);
        this.hips.addChild(rightleg);
        this.setRotateAngle(rightleg, -0.3013F, 0.2148F, 0.0385F);


        this.rightthigh_r1 = new AdvancedModelRenderer(this);
        this.rightthigh_r1.setRotationPoint(-0.7535F, 3.1546F, 1.0489F);
        this.rightleg.addChild(rightthigh_r1);
        this.setRotateAngle(rightthigh_r1, 0.0F, -0.1309F, 0.0F);
        this.rightthigh_r1.cubeList.add(new ModelBox(rightthigh_r1, 50, 0, -2.45F, -5.5F, -4.0F, 6, 11, 8, 0.1F, true));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(-0.0535F, 8.2784F, -1.1674F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.5446F, -0.1947F, -0.0986F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 22, 69, -2.1696F, -0.4753F, -0.9824F, 5, 11, 5, 0.2F, true));

        this.rightfoot = new AdvancedModelRenderer(this);
        this.rightfoot.setRotationPoint(0.0804F, 9.1735F, 1.5951F);
        this.rightleg2.addChild(rightfoot);
        this.rightfoot.cubeList.add(new ModelBox(rightfoot, 74, 60, -3.25F, 0.0F, -3.75F, 7, 2, 5, 0.0F, true));

        this.rightbacktoe = new AdvancedModelRenderer(this);
        this.rightbacktoe.setRotationPoint(0.25F, 1.0F, -3.75F);
        this.rightfoot.addChild(rightbacktoe);
        this.rightbacktoe.cubeList.add(new ModelBox(rightbacktoe, 37, 69, -3.4998F, -1.0F, -2.0F, 7, 2, 2, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }

    public void renderStaticWall(float f) {
        this.rightarm.setScale(0,0,0);
        this.leftarm.setScale(0,0,0);
        this.rightarm.scaleChildren = true;
        this.leftarm.scaleChildren = true;
        this.setRotateAngle(chest, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(neck, -0.2F, 0.0F, 0.05F);
        this.setRotateAngle(neck2, 0.1F, 0.0F, 0.05F);
        this.setRotateAngle(head, 0.3F, 0.05F, 0.1F);
        this.setRotateAngle(jaw, 0.5F, 0.0F, 0.0F);
        this.chest.offsetY = -0.05F;
        this.chest.offsetX = 0.0F;
        this.chest.offsetZ = 0.09F;
        this.chest.render(0.01F);
        this.rightarm.setScale(1,1,1);
        this.leftarm.setScale(1,1,1);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(hips, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.1F, 0.0F, -0.01F);
        this.setRotateAngle(body, 0.12F, 0.0F, 0.0F);
        this.setRotateAngle(chest, 0.05F, 0.0F, 0.03F);
        this.setRotateAngle(neck, -0.2F, 0.1F, 0.0F);
        this.setRotateAngle(neck2, 0.1F, 0.2F, 0.0F);
        this.setRotateAngle(head, 0.1F, 0.3F, 0.1F);
        this.setRotateAngle(jaw, 0.6F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, -0.5F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg, 0.15F, -0.2F, 0.0F);
        this.setRotateAngle(leftleg2, 1.0F, 0.0F, 0.0F);
        this.setRotateAngle(leftfoot, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(leftbacktoe, -0.6F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg, -0.35F, 0.1F, 0.0F);
        this.setRotateAngle(rightleg2, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(rightfoot, 0.25F, 0.0F, 0.0F);
        this.setRotateAngle(rightbacktoe, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(leftarm, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(leftarm2, -0.35F, 0.0F, 0.1F);
        this.setRotateAngle(lefthand, 0.45F, 0.0F, -0.1F);
        this.setRotateAngle(rightarm, 0.9F, 0.0F, 0.3F);
        this.setRotateAngle(rightarm2, -0.4F, -0.3F, -0.5F);
        this.setRotateAngle(righthand, 0.3F, 0.0F, 0.0F);
        this.hips.offsetY = -0.13F;
        this.hips.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = -0.25F;
        this.hips.offsetX = -1.5F;
        this.hips.rotateAngleY = (float)Math.toRadians(200);
        this.hips.rotateAngleX = (float)Math.toRadians(8);
        this.hips.rotateAngleZ = (float)Math.toRadians(-8);
        this.hips.scaleChildren = true;
        float scaler = 0.6F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body2, 0.1F, 0.0F, -0.01F);
        this.setRotateAngle(body, 0.12F, 0.0F, 0.0F);
        this.setRotateAngle(chest, 0.05F, 0.0F, 0.03F);
        this.setRotateAngle(neck, -0.2F, 0.1F, 0.0F);
        this.setRotateAngle(neck2, 0.1F, 0.2F, 0.0F);
        this.setRotateAngle(head, 0.1F, 0.3F, 0.1F);
        this.setRotateAngle(jaw, 0.6F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, -0.5F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg, 0.15F, -0.2F, 0.0F);
        this.setRotateAngle(leftleg2, 1.0F, 0.0F, 0.0F);
        this.setRotateAngle(leftfoot, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(leftbacktoe, -0.6F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg, -0.35F, 0.1F, 0.0F);
        this.setRotateAngle(rightleg2, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(rightfoot, 0.25F, 0.0F, 0.0F);
        this.setRotateAngle(rightbacktoe, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(leftarm, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(leftarm2, -0.35F, 0.0F, 0.1F);
        this.setRotateAngle(lefthand, 0.45F, 0.0F, -0.1F);
        this.setRotateAngle(rightarm, 0.9F, 0.0F, 0.3F);
        this.setRotateAngle(rightarm2, -0.4F, -0.3F, -0.5F);
        this.setRotateAngle(righthand, 0.3F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
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
        //this.resetToDefaultPose();
        //this.body1.offsetY = 0F;
        //this.basin.offsetZ = 0.2F;

        EntityPrehistoricFloraInostrancevia Inostrancevia = (EntityPrehistoricFloraInostrancevia) e;
        float masterSpeed = Inostrancevia.getTravelSpeed();

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, head);

        //float speed = 0.2F;

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.head};
        Inostrancevia.tailBuffer.applyChainSwingBuffer(Tail);

        AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2};
        AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2};

        //AdvancedModelRenderer[] Whole = {this.neck2, this.neck, this.body, this.body2, this.body3, this.tail, this.tail2, this.tail3, this.tail4, this.tail5};

        if (Inostrancevia.getAnimation() == Inostrancevia.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
            //Other stuff

            return;
        }
        
        if (!Inostrancevia.isReallyInWater()) {

            if (f3 == 0.0F || !Inostrancevia.getIsMoving()) {
                this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                this.chainWave(Tail, (0.15F * 0.5F), 0.125F * 0.35F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (0.15F * 0.5F) * 4F, 0.05F * 0.65F, 0.12F, f2, 1F);

                return;
           }

            if (Inostrancevia.getIsFast()) { //Running
                if (Inostrancevia.getIsSneaking()) {

                }
                else { //normal run:

                }


            }
            else { //Walking



            }
        }
        else {
            //Swimming pose:
            if (f3 == 0.0F) { //static in water
                return;
            }
            //moving in water
            return;
        }
    }




    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraInostrancevia ee = (EntityPrehistoricFloraInostrancevia) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    if (ee.getIsSneaking()) {
                        animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                    else {
                        animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
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
            else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) { // not present
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) { // not present
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The graze anim - LLibrary is done below
            animDrink(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The roar anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.RELAX_ANIMATION) { //The noise anim
            animRelax(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.SNIFF_ANIMATION) { //The noise anim
            animSniff(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.YAWN_ANIMATION) { //The noise anim
            animYawn(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraInostrancevia entity = (EntityPrehistoricFloraInostrancevia) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0), hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-130))*0.5), hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*2));

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.75 + (((tickAnim - 0) / 10) * (0.25-(-0.75)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.75-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.25 + (((tickAnim - 10) / 10) * (-0.75-(0.25)));
            zz = -0.75 + (((tickAnim - 10) / 10) * (0-(-0.75)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.75 + (((tickAnim - 20) / 10) * (0.25-(-0.75)));
            zz = 0 + (((tickAnim - 20) / 10) * (-0.75-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0.25 + (((tickAnim - 30) / 10) * (-0.75-(0.25)));
            zz = -0.75 + (((tickAnim - 30) / 10) * (0-(-0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*-1), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-250))*-1));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-200))*1), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*-2));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 25.58493 + (((tickAnim - 0) / 5) * (40.19066-(25.58493)));
            yy = -0.23956 + (((tickAnim - 0) / 5) * (-2.03333-(-0.23956)));
            zz = 5.48858 + (((tickAnim - 0) / 5) * (8.16283-(5.48858)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 40.19066 + (((tickAnim - 5) / 10) * (-32.07473-(40.19066)));
            yy = -2.03333 + (((tickAnim - 5) / 10) * (-4.88301-(-2.03333)));
            zz = 8.16283 + (((tickAnim - 5) / 10) * (-5.04476-(8.16283)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -32.07473 + (((tickAnim - 15) / 5) * (-35.44946-(-32.07473)));
            yy = -4.88301 + (((tickAnim - 15) / 5) * (-3.50361-(-4.88301)));
            zz = -5.04476 + (((tickAnim - 15) / 5) * (-6.70467-(-5.04476)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -35.44946 + (((tickAnim - 20) / 20) * (25.58493-(-35.44946)));
            yy = -3.50361 + (((tickAnim - 20) / 20) * (-0.23956-(-3.50361)));
            zz = -6.70467 + (((tickAnim - 20) / 20) * (5.48858-(-6.70467)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -1 + (((tickAnim - 0) / 10) * (1-(-1)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 1 + (((tickAnim - 10) / 10) * (-1-(1)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -1 + (((tickAnim - 20) / 10) * (0-(-1)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (-1-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm.rotationPointX = this.leftarm.rotationPointX + (float)(xx);
        this.leftarm.rotationPointY = this.leftarm.rotationPointY - (float)(yy);
        this.leftarm.rotationPointZ = this.leftarm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -12.5 + (((tickAnim - 0) / 5) * (-55-(-12.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -55 + (((tickAnim - 5) / 10) * (-11.67-(-55)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -11.67 + (((tickAnim - 15) / 5) * (17.5-(-11.67)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 17.5 + (((tickAnim - 20) / 20) * (-12.5-(17.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -10 + (((tickAnim - 0) / 5) * (43.7495-(-10)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.0412-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.07357-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 43.7495 + (((tickAnim - 5) / 10) * (49.58317-(43.7495)));
            yy = 0.0412 + (((tickAnim - 5) / 10) * (0.01373-(0.0412)));
            zz = -0.07357 + (((tickAnim - 5) / 10) * (-0.02452-(-0.07357)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 49.58317 + (((tickAnim - 15) / 5) * (15-(49.58317)));
            yy = 0.01373 + (((tickAnim - 15) / 5) * (0-(0.01373)));
            zz = -0.02452 + (((tickAnim - 15) / 5) * (0-(-0.02452)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 15 + (((tickAnim - 20) / 20) * (-10-(15)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -2.5 + (((tickAnim - 0) / 5) * (11.25-(-2.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 11.25 + (((tickAnim - 5) / 10) * (21.25-(11.25)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 21.25 + (((tickAnim - 15) / 5) * (0-(21.25)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfronttoe, leftfronttoe.rotateAngleX + (float) Math.toRadians(xx), leftfronttoe.rotateAngleY + (float) Math.toRadians(yy), leftfronttoe.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -35.44946 + (((tickAnim - 0) / 20) * (25.58493-(-35.44946)));
            yy = 3.50361 + (((tickAnim - 0) / 20) * (0.23956-(3.50361)));
            zz = 6.70467 + (((tickAnim - 0) / 20) * (-5.48858-(6.70467)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 25.58493 + (((tickAnim - 20) / 5) * (40.19066-(25.58493)));
            yy = 0.23956 + (((tickAnim - 20) / 5) * (2.03333-(0.23956)));
            zz = -5.48858 + (((tickAnim - 20) / 5) * (-8.16283-(-5.48858)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 40.19066 + (((tickAnim - 25) / 10) * (-32.07473-(40.19066)));
            yy = 2.03333 + (((tickAnim - 25) / 10) * (4.88301-(2.03333)));
            zz = -8.16283 + (((tickAnim - 25) / 10) * (5.04476-(-8.16283)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -32.07473 + (((tickAnim - 35) / 5) * (-35.44946-(-32.07473)));
            yy = 4.88301 + (((tickAnim - 35) / 5) * (3.50361-(4.88301)));
            zz = 5.04476 + (((tickAnim - 35) / 5) * (6.70467-(5.04476)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -1 + (((tickAnim - 0) / 10) * (0-(-1)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (-1-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -1 + (((tickAnim - 20) / 10) * (1-(-1)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 1 + (((tickAnim - 30) / 10) * (-1-(1)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm.rotationPointX = this.rightarm.rotationPointX + (float)(xx);
        this.rightarm.rotationPointY = this.rightarm.rotationPointY - (float)(yy);
        this.rightarm.rotationPointZ = this.rightarm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 17.5 + (((tickAnim - 0) / 20) * (-12.5-(17.5)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -12.5 + (((tickAnim - 20) / 5) * (-55-(-12.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -55 + (((tickAnim - 25) / 10) * (-11.67-(-55)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -11.67 + (((tickAnim - 35) / 5) * (17.5-(-11.67)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 15 + (((tickAnim - 0) / 20) * (-10-(15)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -10 + (((tickAnim - 20) / 5) * (43.7495-(-10)));
            yy = 0 + (((tickAnim - 20) / 5) * (-0.0412-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0.07357-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 43.7495 + (((tickAnim - 25) / 10) * (49.58317-(43.7495)));
            yy = -0.0412 + (((tickAnim - 25) / 10) * (-0.01373-(-0.0412)));
            zz = 0.07357 + (((tickAnim - 25) / 10) * (0.02452-(0.07357)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 49.58317 + (((tickAnim - 35) / 5) * (15-(49.58317)));
            yy = -0.01373 + (((tickAnim - 35) / 5) * (0-(-0.01373)));
            zz = 0.02452 + (((tickAnim - 35) / 5) * (0-(0.02452)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -2.5 + (((tickAnim - 20) / 5) * (11.25-(-2.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 11.25 + (((tickAnim - 25) / 10) * (21.25-(11.25)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 21.25 + (((tickAnim - 35) / 5) * (0-(21.25)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfronttoe, rightfronttoe.rotateAngleX + (float) Math.toRadians(xx), rightfronttoe.rotateAngleY + (float) Math.toRadians(yy), rightfronttoe.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 12.5 + (((tickAnim - 0) / 10) * (20-(12.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 20 + (((tickAnim - 10) / 10) * (12.5-(20)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 12.5 + (((tickAnim - 20) / 10) * (20-(12.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 20 + (((tickAnim - 30) / 10) * (12.5-(20)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -7.5 + (((tickAnim - 0) / 10) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -7.5 + (((tickAnim - 10) / 10) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -7.5 + (((tickAnim - 20) / 10) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -7.5 + (((tickAnim - 30) / 10) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*1)), tail1.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-180))*0.8));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*4), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*4), tail3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -12.79834 + (((tickAnim - 0) / 20) * (42.924-(-12.79834)));
            yy = -0.18081 + (((tickAnim - 0) / 20) * (4.73578-(-0.18081)));
            zz = 2.75866 + (((tickAnim - 0) / 20) * (-7.77067-(2.75866)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 42.924 + (((tickAnim - 20) / 5) * (38.99464-(42.924)));
            yy = 4.73578 + (((tickAnim - 20) / 5) * (4.91047-(4.73578)));
            zz = -7.77067 + (((tickAnim - 20) / 5) * (-6.55089-(-7.77067)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = 38.99464 + (((tickAnim - 25) / 11) * (-26.42579-(38.99464)));
            yy = 4.91047 + (((tickAnim - 25) / 11) * (1.56223-(4.91047)));
            zz = -6.55089 + (((tickAnim - 25) / 11) * (5.57874-(-6.55089)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -26.42579 + (((tickAnim - 36) / 4) * (-12.79834-(-26.42579)));
            yy = 1.56223 + (((tickAnim - 36) / 4) * (-0.18081-(1.56223)));
            zz = 5.57874 + (((tickAnim - 36) / 4) * (2.75866-(5.57874)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -1.4 + (((tickAnim - 0) / 10) * (-0.4-(-1.4)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.4 + (((tickAnim - 10) / 10) * (-1.4-(-0.4)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -1.4 + (((tickAnim - 20) / 10) * (-0.4-(-1.4)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -0.4 + (((tickAnim - 30) / 10) * (-1.4-(-0.4)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg.rotationPointX = this.leftleg.rotationPointX + (float)(xx);
        this.leftleg.rotationPointY = this.leftleg.rotationPointY - (float)(yy);
        this.leftleg.rotationPointZ = this.leftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -12.50267 + (((tickAnim - 0) / 10) * (8.74733-(-12.50267)));
            yy = -0.04401 + (((tickAnim - 0) / 10) * (-0.04401-(-0.04401)));
            zz = -0.01426 + (((tickAnim - 0) / 10) * (-0.01426-(-0.01426)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 8.74733 + (((tickAnim - 10) / 10) * (9.99733-(8.74733)));
            yy = -0.04401 + (((tickAnim - 10) / 10) * (-0.04401-(-0.04401)));
            zz = -0.01426 + (((tickAnim - 10) / 10) * (-0.01426-(-0.01426)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 9.99733 + (((tickAnim - 20) / 5) * (19.37233-(9.99733)));
            yy = -0.04401 + (((tickAnim - 20) / 5) * (-0.04401-(-0.04401)));
            zz = -0.01426 + (((tickAnim - 20) / 5) * (-0.01426-(-0.01426)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 19.37233 + (((tickAnim - 25) / 5) * (28.74733-(19.37233)));
            yy = -0.04401 + (((tickAnim - 25) / 5) * (-0.04401-(-0.04401)));
            zz = -0.01426 + (((tickAnim - 25) / 5) * (-0.01426-(-0.01426)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 28.74733 + (((tickAnim - 30) / 6) * (14.68483-(28.74733)));
            yy = -0.04401 + (((tickAnim - 30) / 6) * (-0.04401-(-0.04401)));
            zz = -0.01426 + (((tickAnim - 30) / 6) * (-0.01426-(-0.01426)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 14.68483 + (((tickAnim - 36) / 4) * (-12.50267-(14.68483)));
            yy = -0.04401 + (((tickAnim - 36) / 4) * (-0.04401-(-0.04401)));
            zz = -0.01426 + (((tickAnim - 36) / 4) * (-0.01426-(-0.01426)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 24.99984 + (((tickAnim - 0) / 10) * (-23.75016-(24.99984)));
            yy = 0.09144 + (((tickAnim - 0) / 10) * (0.09144-(0.09144)));
            zz = 0.0083 + (((tickAnim - 0) / 10) * (0.0083-(0.0083)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -23.75016 + (((tickAnim - 10) / 10) * (-7.50016-(-23.75016)));
            yy = 0.09144 + (((tickAnim - 10) / 10) * (0.09144-(0.09144)));
            zz = 0.0083 + (((tickAnim - 10) / 10) * (0.0083-(0.0083)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -7.50016 + (((tickAnim - 20) / 5) * (-19.37516-(-7.50016)));
            yy = 0.09144 + (((tickAnim - 20) / 5) * (0.09144-(0.09144)));
            zz = 0.0083 + (((tickAnim - 20) / 5) * (0.0083-(0.0083)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -19.37516 + (((tickAnim - 25) / 5) * (-30.92965-(-19.37516)));
            yy = 0.09144 + (((tickAnim - 25) / 5) * (0.09144-(0.09144)));
            zz = 0.0083 + (((tickAnim - 25) / 5) * (0.0083-(0.0083)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = -30.92965 + (((tickAnim - 30) / 6) * (20.59012-(-30.92965)));
            yy = 0.09144 + (((tickAnim - 30) / 6) * (0.09144-(0.09144)));
            zz = 0.0083 + (((tickAnim - 30) / 6) * (0.0083-(0.0083)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 20.59012 + (((tickAnim - 36) / 4) * (24.99984-(20.59012)));
            yy = 0.09144 + (((tickAnim - 36) / 4) * (0.09144-(0.09144)));
            zz = 0.0083 + (((tickAnim - 36) / 4) * (0.0083-(0.0083)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (-42.5-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -42.5 + (((tickAnim - 20) / 5) * (40.63-(-42.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 40.63 + (((tickAnim - 25) / 15) * (0-(40.63)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftbacktoe, leftbacktoe.rotateAngleX + (float) Math.toRadians(xx), leftbacktoe.rotateAngleY + (float) Math.toRadians(yy), leftbacktoe.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 42.924 + (((tickAnim - 0) / 5) * (38.99464-(42.924)));
            yy = -4.73578 + (((tickAnim - 0) / 5) * (-4.91047-(-4.73578)));
            zz = 7.77067 + (((tickAnim - 0) / 5) * (6.55089-(7.77067)));
        }
        else if (tickAnim >= 5 && tickAnim < 16) {
            xx = 38.99464 + (((tickAnim - 5) / 11) * (-26.42579-(38.99464)));
            yy = -4.91047 + (((tickAnim - 5) / 11) * (-1.56223-(-4.91047)));
            zz = 6.55089 + (((tickAnim - 5) / 11) * (-5.57874-(6.55089)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -26.42579 + (((tickAnim - 16) / 4) * (-12.79834-(-26.42579)));
            yy = -1.56223 + (((tickAnim - 16) / 4) * (0.18081-(-1.56223)));
            zz = -5.57874 + (((tickAnim - 16) / 4) * (-2.75866-(-5.57874)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -12.79834 + (((tickAnim - 20) / 20) * (42.924-(-12.79834)));
            yy = 0.18081 + (((tickAnim - 20) / 20) * (-4.73578-(0.18081)));
            zz = -2.75866 + (((tickAnim - 20) / 20) * (7.77067-(-2.75866)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -1.4 + (((tickAnim - 0) / 10) * (-0.4-(-1.4)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.4 + (((tickAnim - 10) / 10) * (-1.4-(-0.4)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -1.4 + (((tickAnim - 20) / 10) * (-0.4-(-1.4)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -0.4 + (((tickAnim - 30) / 10) * (-1.4-(-0.4)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg.rotationPointX = this.rightleg.rotationPointX + (float)(xx);
        this.rightleg.rotationPointY = this.rightleg.rotationPointY - (float)(yy);
        this.rightleg.rotationPointZ = this.rightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 9.99733 + (((tickAnim - 0) / 5) * (19.37233-(9.99733)));
            yy = 0.04401 + (((tickAnim - 0) / 5) * (0.04401-(0.04401)));
            zz = 0.01426 + (((tickAnim - 0) / 5) * (0.01426-(0.01426)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 19.37233 + (((tickAnim - 5) / 5) * (28.74733-(19.37233)));
            yy = 0.04401 + (((tickAnim - 5) / 5) * (0.04401-(0.04401)));
            zz = 0.01426 + (((tickAnim - 5) / 5) * (0.01426-(0.01426)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 28.74733 + (((tickAnim - 10) / 6) * (14.68483-(28.74733)));
            yy = 0.04401 + (((tickAnim - 10) / 6) * (0.04401-(0.04401)));
            zz = 0.01426 + (((tickAnim - 10) / 6) * (0.01426-(0.01426)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 14.68483 + (((tickAnim - 16) / 4) * (-12.50267-(14.68483)));
            yy = 0.04401 + (((tickAnim - 16) / 4) * (0.04401-(0.04401)));
            zz = 0.01426 + (((tickAnim - 16) / 4) * (0.01426-(0.01426)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -12.50267 + (((tickAnim - 20) / 10) * (8.74733-(-12.50267)));
            yy = 0.04401 + (((tickAnim - 20) / 10) * (0.04401-(0.04401)));
            zz = 0.01426 + (((tickAnim - 20) / 10) * (0.01426-(0.01426)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 8.74733 + (((tickAnim - 30) / 10) * (9.99733-(8.74733)));
            yy = 0.04401 + (((tickAnim - 30) / 10) * (0.04401-(0.04401)));
            zz = 0.01426 + (((tickAnim - 30) / 10) * (0.01426-(0.01426)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -7.50016 + (((tickAnim - 0) / 5) * (-19.37516-(-7.50016)));
            yy = -0.09144 + (((tickAnim - 0) / 5) * (-0.09144-(-0.09144)));
            zz = -0.0083 + (((tickAnim - 0) / 5) * (-0.0083-(-0.0083)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -19.37516 + (((tickAnim - 5) / 5) * (-30.92965-(-19.37516)));
            yy = -0.09144 + (((tickAnim - 5) / 5) * (-0.09144-(-0.09144)));
            zz = -0.0083 + (((tickAnim - 5) / 5) * (-0.0083-(-0.0083)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -30.92965 + (((tickAnim - 10) / 6) * (20.59012-(-30.92965)));
            yy = -0.09144 + (((tickAnim - 10) / 6) * (-0.09144-(-0.09144)));
            zz = -0.0083 + (((tickAnim - 10) / 6) * (-0.0083-(-0.0083)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 20.59012 + (((tickAnim - 16) / 4) * (24.99984-(20.59012)));
            yy = -0.09144 + (((tickAnim - 16) / 4) * (-0.09144-(-0.09144)));
            zz = -0.0083 + (((tickAnim - 16) / 4) * (-0.0083-(-0.0083)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 24.99984 + (((tickAnim - 20) / 10) * (-23.75016-(24.99984)));
            yy = -0.09144 + (((tickAnim - 20) / 10) * (-0.09144-(-0.09144)));
            zz = -0.0083 + (((tickAnim - 20) / 10) * (-0.0083-(-0.0083)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -23.75016 + (((tickAnim - 30) / 10) * (-7.50016-(-23.75016)));
            yy = -0.09144 + (((tickAnim - 30) / 10) * (-0.09144-(-0.09144)));
            zz = -0.0083 + (((tickAnim - 30) / 10) * (-0.0083-(-0.0083)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -42.5 + (((tickAnim - 0) / 5) * (40.63-(-42.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 40.63 + (((tickAnim - 5) / 15) * (0-(40.63)));
            yy = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (-42.5-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightbacktoe, rightbacktoe.rotateAngleX + (float) Math.toRadians(xx), rightbacktoe.rotateAngleY + (float) Math.toRadians(yy), rightbacktoe.rotateAngleZ + (float) Math.toRadians(zz));

       
    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraInostrancevia entity = (EntityPrehistoricFloraInostrancevia) entitylivingbaseIn;

        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0), hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-130))*0.5), hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-50))*2));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.75-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.25 + (((tickAnim - 3) / 5) * (0-(0.25)));
            zz = -0.75 + (((tickAnim - 3) / 5) * (0-(-0.75)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0.25-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (-0.75-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0.25 + (((tickAnim - 11) / 4) * (0-(0.25)));
            zz = -0.75 + (((tickAnim - 11) / 4) * (0-(-0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-90))*-1), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-250))*-1));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-200))*1), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-100))*-2));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 38.32619 + (((tickAnim - 0) / 2) * (60.63277-(38.32619)));
            yy = -0.99077 + (((tickAnim - 0) / 2) * (-7.46669-(-0.99077)));
            zz = 8.65191 + (((tickAnim - 0) / 2) * (10.18861-(8.65191)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = 60.63277 + (((tickAnim - 2) / 6) * (-63.09502-(60.63277)));
            yy = -7.46669 + (((tickAnim - 2) / 6) * (-6.53289-(-7.46669)));
            zz = 10.18861 + (((tickAnim - 2) / 6) * (-10.15451-(10.18861)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -63.09502 + (((tickAnim - 8) / 7) * (38.32619-(-63.09502)));
            yy = -6.53289 + (((tickAnim - 8) / 7) * (-0.99077-(-6.53289)));
            zz = -10.15451 + (((tickAnim - 8) / 7) * (8.65191-(-10.15451)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (2-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 2 + (((tickAnim - 3) / 5) * (0-(2)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (-1-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = -1 + (((tickAnim - 10) / 5) * (0-(-1)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm.rotationPointX = this.leftarm.rotationPointX + (float)(xx);
        this.leftarm.rotationPointY = this.leftarm.rotationPointY - (float)(yy);
        this.leftarm.rotationPointZ = this.leftarm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 9.97689 + (((tickAnim - 0) / 2) * (-38.91536-(9.97689)));
            yy = 0.13814 + (((tickAnim - 0) / 2) * (0.19716-(0.13814)));
            zz = 0.11061 + (((tickAnim - 0) / 2) * (0.14223-(0.11061)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -38.91536 + (((tickAnim - 2) / 1) * (-61.69986-(-38.91536)));
            yy = 0.19716 + (((tickAnim - 2) / 1) * (0.31519-(0.19716)));
            zz = 0.14223 + (((tickAnim - 2) / 1) * (0.20546-(0.14223)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -61.69986 + (((tickAnim - 3) / 5) * (-0.02311-(-61.69986)));
            yy = 0.31519 + (((tickAnim - 3) / 5) * (0.13814-(0.31519)));
            zz = 0.20546 + (((tickAnim - 3) / 5) * (0.11061-(0.20546)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -0.02311 + (((tickAnim - 8) / 7) * (9.97689-(-0.02311)));
            yy = 0.13814 + (((tickAnim - 8) / 7) * (0.13814-(0.13814)));
            zz = 0.11061 + (((tickAnim - 8) / 7) * (0.11061-(0.11061)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 62.5 + (((tickAnim - 0) / 2) * (19.38-(62.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 19.38 + (((tickAnim - 2) / 1) * (0.63-(19.38)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0.63 + (((tickAnim - 3) / 5) * (77.5-(0.63)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 77.5 + (((tickAnim - 8) / 2) * (30-(77.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 30 + (((tickAnim - 10) / 3) * (-11.25-(30)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -11.25 + (((tickAnim - 13) / 2) * (62.5-(-11.25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 30 + (((tickAnim - 0) / 8) * (2.5-(30)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 2.5 + (((tickAnim - 8) / 2) * (-8.33-(2.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -8.33 + (((tickAnim - 10) / 3) * (3.34-(-8.33)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 3.34 + (((tickAnim - 13) / 1) * (-51.66-(3.34)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -51.66 + (((tickAnim - 14) / 1) * (30-(-51.66)));
            yy = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfronttoe, leftfronttoe.rotateAngleX + (float) Math.toRadians(xx), leftfronttoe.rotateAngleY + (float) Math.toRadians(yy), leftfronttoe.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -63.09502 + (((tickAnim - 0) / 8) * (38.32619-(-63.09502)));
            yy = 6.53289 + (((tickAnim - 0) / 8) * (0.99077-(6.53289)));
            zz = 10.15451 + (((tickAnim - 0) / 8) * (-8.65191-(10.15451)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 38.32619 + (((tickAnim - 8) / 1) * (60.63277-(38.32619)));
            yy = 0.99077 + (((tickAnim - 8) / 1) * (7.46669-(0.99077)));
            zz = -8.65191 + (((tickAnim - 8) / 1) * (-10.18861-(-8.65191)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 60.63277 + (((tickAnim - 9) / 6) * (-63.09502-(60.63277)));
            yy = 7.46669 + (((tickAnim - 9) / 6) * (6.53289-(7.46669)));
            zz = -10.18861 + (((tickAnim - 9) / 6) * (10.15451-(-10.18861)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-1-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = -1 + (((tickAnim - 3) / 5) * (0-(-1)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (2-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 2 + (((tickAnim - 11) / 4) * (0-(2)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm.rotationPointX = this.rightarm.rotationPointX + (float)(xx);
        this.rightarm.rotationPointY = this.rightarm.rotationPointY - (float)(yy);
        this.rightarm.rotationPointZ = this.rightarm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -0.02311 + (((tickAnim - 0) / 8) * (9.97689-(-0.02311)));
            yy = -0.13814 + (((tickAnim - 0) / 8) * (-0.13814-(-0.13814)));
            zz = -0.11061 + (((tickAnim - 0) / 8) * (-0.11061-(-0.11061)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 9.97689 + (((tickAnim - 8) / 1) * (-38.91536-(9.97689)));
            yy = -0.13814 + (((tickAnim - 8) / 1) * (-0.19716-(-0.13814)));
            zz = -0.11061 + (((tickAnim - 8) / 1) * (-0.14223-(-0.11061)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -38.91536 + (((tickAnim - 9) / 2) * (-61.69986-(-38.91536)));
            yy = -0.19716 + (((tickAnim - 9) / 2) * (-0.31519-(-0.19716)));
            zz = -0.14223 + (((tickAnim - 9) / 2) * (-0.20546-(-0.14223)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -61.69986 + (((tickAnim - 11) / 4) * (-0.02311-(-61.69986)));
            yy = -0.31519 + (((tickAnim - 11) / 4) * (-0.13814-(-0.31519)));
            zz = -0.20546 + (((tickAnim - 11) / 4) * (-0.11061-(-0.20546)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 77.5 + (((tickAnim - 0) / 3) * (30-(77.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 30 + (((tickAnim - 3) / 2) * (-11.25-(30)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -11.25 + (((tickAnim - 5) / 3) * (62.5-(-11.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 62.5 + (((tickAnim - 8) / 1) * (19.38-(62.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 19.38 + (((tickAnim - 9) / 2) * (0.63-(19.38)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0.63 + (((tickAnim - 11) / 4) * (77.5-(0.63)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 2.5 + (((tickAnim - 0) / 3) * (-8.33-(2.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -8.33 + (((tickAnim - 3) / 2) * (3.34-(-8.33)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 3.34 + (((tickAnim - 5) / 2) * (-51.66-(3.34)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -51.66 + (((tickAnim - 7) / 1) * (30-(-51.66)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 30 + (((tickAnim - 8) / 7) * (2.5-(30)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfronttoe, rightfronttoe.rotateAngleX + (float) Math.toRadians(xx), rightfronttoe.rotateAngleY + (float) Math.toRadians(yy), rightfronttoe.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 12.5 + (((tickAnim - 0) / 3) * (20-(12.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 20 + (((tickAnim - 3) / 5) * (12.5-(20)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 12.5 + (((tickAnim - 8) / 3) * (20-(12.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 20 + (((tickAnim - 11) / 4) * (12.5-(20)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -7.5 + (((tickAnim - 0) / 3) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -7.5 + (((tickAnim - 3) / 5) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -7.5 + (((tickAnim - 8) / 3) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -7.5 + (((tickAnim - 11) / 4) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-100))*1)), tail1.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-180))*0.8));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*4), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*4), tail3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -12.79834 + (((tickAnim - 0) / 8) * (42.924-(-12.79834)));
            yy = -0.18081 + (((tickAnim - 0) / 8) * (4.73578-(-0.18081)));
            zz = 2.75866 + (((tickAnim - 0) / 8) * (-7.77067-(2.75866)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 42.924 + (((tickAnim - 8) / 1) * (53.99341-(42.924)));
            yy = 4.73578 + (((tickAnim - 8) / 1) * (3.50663-(4.73578)));
            zz = -7.77067 + (((tickAnim - 8) / 1) * (-5.13833-(-7.77067)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 53.99341 + (((tickAnim - 9) / 4) * (-32.95573-(53.99341)));
            yy = 3.50663 + (((tickAnim - 9) / 4) * (0.63862-(3.50663)));
            zz = -5.13833 + (((tickAnim - 9) / 4) * (1.00377-(-5.13833)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -32.95573 + (((tickAnim - 13) / 2) * (-12.79834-(-32.95573)));
            yy = 0.63862 + (((tickAnim - 13) / 2) * (-0.18081-(0.63862)));
            zz = 1.00377 + (((tickAnim - 13) / 2) * (2.75866-(1.00377)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -1.4 + (((tickAnim - 0) / 3) * (-0.4-(-1.4)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = -0.4 + (((tickAnim - 3) / 5) * (-1.4-(-0.4)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = -1.4 + (((tickAnim - 8) / 3) * (-0.4-(-1.4)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = -0.4 + (((tickAnim - 11) / 4) * (-1.4-(-0.4)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg.rotationPointX = this.leftleg.rotationPointX + (float)(xx);
        this.leftleg.rotationPointY = this.leftleg.rotationPointY - (float)(yy);
        this.leftleg.rotationPointZ = this.leftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -12.50267 + (((tickAnim - 0) / 3) * (8.74733-(-12.50267)));
            yy = -0.04401 + (((tickAnim - 0) / 3) * (-0.04401-(-0.04401)));
            zz = -0.01426 + (((tickAnim - 0) / 3) * (-0.01426-(-0.01426)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 8.74733 + (((tickAnim - 3) / 5) * (9.99733-(8.74733)));
            yy = -0.04401 + (((tickAnim - 3) / 5) * (-0.04401-(-0.04401)));
            zz = -0.01426 + (((tickAnim - 3) / 5) * (-0.01426-(-0.01426)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 9.99733 + (((tickAnim - 8) / 1) * (19.37233-(9.99733)));
            yy = -0.04401 + (((tickAnim - 8) / 1) * (-0.04401-(-0.04401)));
            zz = -0.01426 + (((tickAnim - 8) / 1) * (-0.01426-(-0.01426)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 19.37233 + (((tickAnim - 9) / 2) * (28.74733-(19.37233)));
            yy = -0.04401 + (((tickAnim - 9) / 2) * (-0.04401-(-0.04401)));
            zz = -0.01426 + (((tickAnim - 9) / 2) * (-0.01426-(-0.01426)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 28.74733 + (((tickAnim - 11) / 2) * (-7.81517-(28.74733)));
            yy = -0.04401 + (((tickAnim - 11) / 2) * (-0.04401-(-0.04401)));
            zz = -0.01426 + (((tickAnim - 11) / 2) * (-0.01426-(-0.01426)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -7.81517 + (((tickAnim - 13) / 2) * (-12.50267-(-7.81517)));
            yy = -0.04401 + (((tickAnim - 13) / 2) * (-0.04401-(-0.04401)));
            zz = -0.01426 + (((tickAnim - 13) / 2) * (-0.01426-(-0.01426)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 24.99984 + (((tickAnim - 0) / 3) * (-23.75016-(24.99984)));
            yy = 0.09144 + (((tickAnim - 0) / 3) * (0.09144-(0.09144)));
            zz = 0.0083 + (((tickAnim - 0) / 3) * (0.0083-(0.0083)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -23.75016 + (((tickAnim - 3) / 5) * (-7.50016-(-23.75016)));
            yy = 0.09144 + (((tickAnim - 3) / 5) * (0.09144-(0.09144)));
            zz = 0.0083 + (((tickAnim - 3) / 5) * (0.0083-(0.0083)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -7.50016 + (((tickAnim - 8) / 1) * (43.12484-(-7.50016)));
            yy = 0.09144 + (((tickAnim - 8) / 1) * (0.09144-(0.09144)));
            zz = 0.0083 + (((tickAnim - 8) / 1) * (0.0083-(0.0083)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 43.12484 + (((tickAnim - 9) / 2) * (-30.92965-(43.12484)));
            yy = 0.09144 + (((tickAnim - 9) / 2) * (0.09144-(0.09144)));
            zz = 0.0083 + (((tickAnim - 9) / 2) * (0.0083-(0.0083)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -30.92965 + (((tickAnim - 11) / 2) * (15.59012-(-30.92965)));
            yy = 0.09144 + (((tickAnim - 11) / 2) * (0.09144-(0.09144)));
            zz = 0.0083 + (((tickAnim - 11) / 2) * (0.0083-(0.0083)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 15.59012 + (((tickAnim - 13) / 2) * (24.99984-(15.59012)));
            yy = 0.09144 + (((tickAnim - 13) / 2) * (0.09144-(0.09144)));
            zz = 0.0083 + (((tickAnim - 13) / 2) * (0.0083-(0.0083)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (-42.5-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -42.5 + (((tickAnim - 8) / 1) * (40.63-(-42.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 40.63 + (((tickAnim - 9) / 6) * (0-(40.63)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftbacktoe, leftbacktoe.rotateAngleX + (float) Math.toRadians(xx), leftbacktoe.rotateAngleY + (float) Math.toRadians(yy), leftbacktoe.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 42.924 + (((tickAnim - 0) / 2) * (53.99341-(42.924)));
            yy = -4.73578 + (((tickAnim - 0) / 2) * (-3.50663-(-4.73578)));
            zz = 7.77067 + (((tickAnim - 0) / 2) * (5.13833-(7.77067)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 53.99341 + (((tickAnim - 2) / 4) * (-32.95573-(53.99341)));
            yy = -3.50663 + (((tickAnim - 2) / 4) * (-0.63862-(-3.50663)));
            zz = 5.13833 + (((tickAnim - 2) / 4) * (-1.00377-(5.13833)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -32.95573 + (((tickAnim - 6) / 2) * (-12.79834-(-32.95573)));
            yy = -0.63862 + (((tickAnim - 6) / 2) * (0.18081-(-0.63862)));
            zz = -1.00377 + (((tickAnim - 6) / 2) * (-2.75866-(-1.00377)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -12.79834 + (((tickAnim - 8) / 7) * (42.924-(-12.79834)));
            yy = 0.18081 + (((tickAnim - 8) / 7) * (-4.73578-(0.18081)));
            zz = -2.75866 + (((tickAnim - 8) / 7) * (7.77067-(-2.75866)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -1.4 + (((tickAnim - 0) / 3) * (-0.4-(-1.4)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = -0.4 + (((tickAnim - 3) / 5) * (-1.4-(-0.4)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = -1.4 + (((tickAnim - 8) / 3) * (-0.4-(-1.4)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = -0.4 + (((tickAnim - 11) / 4) * (-1.4-(-0.4)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg.rotationPointX = this.rightleg.rotationPointX + (float)(xx);
        this.rightleg.rotationPointY = this.rightleg.rotationPointY - (float)(yy);
        this.rightleg.rotationPointZ = this.rightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 9.99733 + (((tickAnim - 0) / 2) * (19.37233-(9.99733)));
            yy = 0.04401 + (((tickAnim - 0) / 2) * (0.04401-(0.04401)));
            zz = 0.01426 + (((tickAnim - 0) / 2) * (0.01426-(0.01426)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 19.37233 + (((tickAnim - 2) / 1) * (28.74733-(19.37233)));
            yy = 0.04401 + (((tickAnim - 2) / 1) * (0.04401-(0.04401)));
            zz = 0.01426 + (((tickAnim - 2) / 1) * (0.01426-(0.01426)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 28.74733 + (((tickAnim - 3) / 3) * (-7.81517-(28.74733)));
            yy = 0.04401 + (((tickAnim - 3) / 3) * (0.04401-(0.04401)));
            zz = 0.01426 + (((tickAnim - 3) / 3) * (0.01426-(0.01426)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -7.81517 + (((tickAnim - 6) / 2) * (-12.50267-(-7.81517)));
            yy = 0.04401 + (((tickAnim - 6) / 2) * (0.04401-(0.04401)));
            zz = 0.01426 + (((tickAnim - 6) / 2) * (0.01426-(0.01426)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -12.50267 + (((tickAnim - 8) / 3) * (8.74733-(-12.50267)));
            yy = 0.04401 + (((tickAnim - 8) / 3) * (0.04401-(0.04401)));
            zz = 0.01426 + (((tickAnim - 8) / 3) * (0.01426-(0.01426)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 8.74733 + (((tickAnim - 11) / 4) * (9.99733-(8.74733)));
            yy = 0.04401 + (((tickAnim - 11) / 4) * (0.04401-(0.04401)));
            zz = 0.01426 + (((tickAnim - 11) / 4) * (0.01426-(0.01426)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -7.50016 + (((tickAnim - 0) / 2) * (43.12484-(-7.50016)));
            yy = -0.09144 + (((tickAnim - 0) / 2) * (-0.09144-(-0.09144)));
            zz = -0.0083 + (((tickAnim - 0) / 2) * (-0.0083-(-0.0083)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 43.12484 + (((tickAnim - 2) / 1) * (-30.92965-(43.12484)));
            yy = -0.09144 + (((tickAnim - 2) / 1) * (-0.09144-(-0.09144)));
            zz = -0.0083 + (((tickAnim - 2) / 1) * (-0.0083-(-0.0083)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -30.92965 + (((tickAnim - 3) / 3) * (15.59012-(-30.92965)));
            yy = -0.09144 + (((tickAnim - 3) / 3) * (-0.09144-(-0.09144)));
            zz = -0.0083 + (((tickAnim - 3) / 3) * (-0.0083-(-0.0083)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 15.59012 + (((tickAnim - 6) / 2) * (24.99984-(15.59012)));
            yy = -0.09144 + (((tickAnim - 6) / 2) * (-0.09144-(-0.09144)));
            zz = -0.0083 + (((tickAnim - 6) / 2) * (-0.0083-(-0.0083)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 24.99984 + (((tickAnim - 8) / 3) * (-23.75016-(24.99984)));
            yy = -0.09144 + (((tickAnim - 8) / 3) * (-0.09144-(-0.09144)));
            zz = -0.0083 + (((tickAnim - 8) / 3) * (-0.0083-(-0.0083)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -23.75016 + (((tickAnim - 11) / 4) * (-7.50016-(-23.75016)));
            yy = -0.09144 + (((tickAnim - 11) / 4) * (-0.09144-(-0.09144)));
            zz = -0.0083 + (((tickAnim - 11) / 4) * (-0.0083-(-0.0083)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -42.5 + (((tickAnim - 0) / 2) * (40.63-(-42.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = 40.63 + (((tickAnim - 2) / 6) * (0-(40.63)));
            yy = 0 + (((tickAnim - 2) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 6) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (-42.5-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightbacktoe, rightbacktoe.rotateAngleX + (float) Math.toRadians(xx), rightbacktoe.rotateAngleY + (float) Math.toRadians(yy), rightbacktoe.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraInostrancevia entity = (EntityPrehistoricFloraInostrancevia) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 27.5 + (((tickAnim - 20) / 20) * (0-(27.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-6.09586-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0.11839-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-0.97792-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = -6.09586 + (((tickAnim - 11) / 10) * (12.31565-(-6.09586)));
            yy = 0.11839 + (((tickAnim - 11) / 10) * (0.22767-(0.11839)));
            zz = -0.97792 + (((tickAnim - 11) / 10) * (-1.88061-(-0.97792)));
        }
        else if (tickAnim >= 21 && tickAnim < 32) {
            xx = 12.31565 + (((tickAnim - 21) / 11) * (15.35463-(12.31565)));
            yy = 0.22767 + (((tickAnim - 21) / 11) * (0.09899-(0.22767)));
            zz = -1.88061 + (((tickAnim - 21) / 11) * (-0.81766-(-1.88061)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 15.35463 + (((tickAnim - 32) / 8) * (0-(15.35463)));
            yy = 0.09899 + (((tickAnim - 32) / 8) * (0-(0.09899)));
            zz = -0.81766 + (((tickAnim - 32) / 8) * (0-(-0.81766)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (9.17-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 9.17 + (((tickAnim - 13) / 12) * (12.5-(9.17)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 12.5 + (((tickAnim - 25) / 15) * (0-(12.5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (25-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 25 + (((tickAnim - 20) / 4) * (0-(25)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraInostrancevia entity = (EntityPrehistoricFloraInostrancevia) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 20 + (((tickAnim - 0) / 10) * (25-(20)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 25 + (((tickAnim - 10) / 10) * (20-(25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -5 + (((tickAnim - 0) / 10) * (-10-(-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -10 + (((tickAnim - 10) / 10) * (-5-(-10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -15 + (((tickAnim - 0) / 3) * (-15-(-15)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -15 + (((tickAnim - 3) / 5) * (-27.5-(-15)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -27.5 + (((tickAnim - 8) / 5) * (-27.5-(-27.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -27.5 + (((tickAnim - 13) / 3) * (-15-(-27.5)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -15 + (((tickAnim - 16) / 4) * (-15-(-15)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (30-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 30 + (((tickAnim - 5) / 4) * (37.5-(30)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 37.5 + (((tickAnim - 9) / 5) * (30-(37.5)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 30 + (((tickAnim - 14) / 6) * (0-(30)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraInostrancevia entity = (EntityPrehistoricFloraInostrancevia) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -7.5 + (((tickAnim - 25) / 25) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-3-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = -3 + (((tickAnim - 25) / 25) * (0-(-3)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 2.5 + (((tickAnim - 25) / 25) * (0-(2.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 25) / 25) * (0-(5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (17.91767-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0.08425-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (3.86212-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 17.91767 + (((tickAnim - 25) / 25) * (0-(17.91767)));
            yy = 0.08425 + (((tickAnim - 25) / 25) * (0-(0.08425)));
            zz = 3.86212 + (((tickAnim - 25) / 25) * (0-(3.86212)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -27.5 + (((tickAnim - 25) / 25) * (0-(-27.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 7.5 + (((tickAnim - 25) / 25) * (0-(7.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (17.91767-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-0.08425-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-3.86212-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 17.91767 + (((tickAnim - 25) / 25) * (0-(17.91767)));
            yy = -0.08425 + (((tickAnim - 25) / 25) * (0-(-0.08425)));
            zz = -3.86212 + (((tickAnim - 25) / 25) * (0-(-3.86212)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -27.5 + (((tickAnim - 25) / 25) * (0-(-27.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 7.5 + (((tickAnim - 25) / 25) * (0-(7.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 12.5 + (((tickAnim - 25) / 25) * (0-(12.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 12.5 + (((tickAnim - 25) / 25) * (0-(12.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-23.03134-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0.10802-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (4.95177-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -23.03134 + (((tickAnim - 25) / 25) * (0-(-23.03134)));
            yy = 0.10802 + (((tickAnim - 25) / 25) * (0-(0.10802)));
            zz = 4.95177 + (((tickAnim - 25) / 25) * (0-(4.95177)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-1.5-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = -1.5 + (((tickAnim - 25) / 25) * (0-(-1.5)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg.rotationPointX = this.leftleg.rotationPointX + (float)(xx);
        this.leftleg.rotationPointY = this.leftleg.rotationPointY - (float)(yy);
        this.leftleg.rotationPointZ = this.leftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (47.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 47.5 + (((tickAnim - 25) / 25) * (0-(47.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -17.5 + (((tickAnim - 25) / 25) * (0-(-17.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-23.03134-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-0.10802-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-4.95177-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -23.03134 + (((tickAnim - 25) / 25) * (0-(-23.03134)));
            yy = -0.10802 + (((tickAnim - 25) / 25) * (0-(-0.10802)));
            zz = -4.95177 + (((tickAnim - 25) / 25) * (0-(-4.95177)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-1.5-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = -1.5 + (((tickAnim - 25) / 25) * (0-(-1.5)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg.rotationPointX = this.rightleg.rotationPointX + (float)(xx);
        this.rightleg.rotationPointY = this.rightleg.rotationPointY - (float)(yy);
        this.rightleg.rotationPointZ = this.rightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (47.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 47.5 + (((tickAnim - 25) / 25) * (0-(47.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -17.5 + (((tickAnim - 25) / 25) * (0-(-17.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraInostrancevia entity = (EntityPrehistoricFloraInostrancevia) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (32.94757-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (3.1248-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-6.31353-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 32.94757 + (((tickAnim - 18) / 10) * (8.13096-(32.94757)));
            yy = 3.1248 + (((tickAnim - 18) / 10) * (0.8337-(3.1248)));
            zz = -6.31353 + (((tickAnim - 18) / 10) * (-1.61045-(-6.31353)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 8.13096 + (((tickAnim - 28) / 8) * (-31.93388-(8.13096)));
            yy = 0.8337 + (((tickAnim - 28) / 8) * (0.87982-(0.8337)));
            zz = -1.61045 + (((tickAnim - 28) / 8) * (6.70998-(-1.61045)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -31.93388 + (((tickAnim - 36) / 4) * (0-(-31.93388)));
            yy = 0.87982 + (((tickAnim - 36) / 4) * (0-(0.87982)));
            zz = 6.70998 + (((tickAnim - 36) / 4) * (0-(6.70998)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-2.82-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -2.82 + (((tickAnim - 11) / 7) * (-0.47-(-2.82)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -0.47 + (((tickAnim - 18) / 10) * (52.5-(-0.47)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 52.5 + (((tickAnim - 28) / 12) * (0-(52.5)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -22.5 + (((tickAnim - 11) / 7) * (-20-(-22.5)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -20 + (((tickAnim - 18) / 10) * (50.83-(-20)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 50.83 + (((tickAnim - 28) / 4) * (-11.11-(50.83)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -11.11 + (((tickAnim - 32) / 8) * (0-(-11.11)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (30-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 30 + (((tickAnim - 11) / 7) * (-15-(30)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -15 + (((tickAnim - 18) / 10) * (51.88-(-15)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 51.88 + (((tickAnim - 28) / 4) * (7.09-(51.88)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 7.09 + (((tickAnim - 32) / 8) * (0-(7.09)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftbacktoe, leftbacktoe.rotateAngleX + (float) Math.toRadians(xx), leftbacktoe.rotateAngleY + (float) Math.toRadians(yy), leftbacktoe.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animDrink(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraInostrancevia entity = (EntityPrehistoricFloraInostrancevia) entitylivingbaseIn;

        int animCycle = 60;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 47) {
            xx = 5 + (((tickAnim - 15) / 32) * (5-(5)));
            yy = 0 + (((tickAnim - 15) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 32) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 5 + (((tickAnim - 47) / 13) * (0-(5)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 47) {
            xx = 2.5 + (((tickAnim - 15) / 32) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 15) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 32) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 2.5 + (((tickAnim - 47) / 13) * (0-(2.5)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 47) {
            xx = 2.5 + (((tickAnim - 15) / 32) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 15) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 32) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 2.5 + (((tickAnim - 47) / 13) * (0-(2.5)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (20.47544-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (4.40924-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 47) {
            xx = 20.47544 + (((tickAnim - 15) / 32) * (20.47544-(20.47544)));
            yy = 0 + (((tickAnim - 15) / 32) * (0-(0)));
            zz = 4.40924 + (((tickAnim - 15) / 32) * (4.40924-(4.40924)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 20.47544 + (((tickAnim - 47) / 13) * (0-(20.47544)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = 4.40924 + (((tickAnim - 47) / 13) * (0-(4.40924)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-65-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 47) {
            xx = -65 + (((tickAnim - 15) / 32) * (-65-(-65)));
            yy = 0 + (((tickAnim - 15) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 32) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = -65 + (((tickAnim - 47) / 13) * (0-(-65)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (35-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 47) {
            xx = 35 + (((tickAnim - 15) / 32) * (35-(35)));
            yy = 0 + (((tickAnim - 15) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 32) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 35 + (((tickAnim - 47) / 13) * (0-(35)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (20.47544-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-4.40924-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 47) {
            xx = 20.47544 + (((tickAnim - 15) / 32) * (20.47544-(20.47544)));
            yy = 0 + (((tickAnim - 15) / 32) * (0-(0)));
            zz = -4.40924 + (((tickAnim - 15) / 32) * (-4.40924-(-4.40924)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 20.47544 + (((tickAnim - 47) / 13) * (0-(20.47544)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = -4.40924 + (((tickAnim - 47) / 13) * (0-(-4.40924)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-65-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 47) {
            xx = -65 + (((tickAnim - 15) / 32) * (-65-(-65)));
            yy = 0 + (((tickAnim - 15) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 32) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = -65 + (((tickAnim - 47) / 13) * (0-(-65)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (35-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 47) {
            xx = 35 + (((tickAnim - 15) / 32) * (35-(35)));
            yy = 0 + (((tickAnim - 15) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 32) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 35 + (((tickAnim - 47) / 13) * (0-(35)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (30-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 27) {
            xx = 30 + (((tickAnim - 15) / 12) * (25-(30)));
            yy = 0 + (((tickAnim - 15) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 12) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 25 + (((tickAnim - 27) / 8) * (29.5-(25)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 47) {
            xx = 29.5 + (((tickAnim - 35) / 12) * (30-(29.5)));
            yy = 0 + (((tickAnim - 35) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 12) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 30 + (((tickAnim - 47) / 13) * (0-(30)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 26) {
            xx = 10 + (((tickAnim - 15) / 11) * (5-(10)));
            yy = 0 + (((tickAnim - 15) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 11) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 5 + (((tickAnim - 26) / 6) * (9.06-(5)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 9.06 + (((tickAnim - 32) / 8) * (2.07-(9.06)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 47) {
            xx = 2.07 + (((tickAnim - 40) / 7) * (10-(2.07)));
            yy = 0 + (((tickAnim - 40) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 7) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 10 + (((tickAnim - 47) / 13) * (0-(10)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = 15 + (((tickAnim - 15) / 9) * (20-(15)));
            yy = 0 + (((tickAnim - 15) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 9) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 34) {
            xx = 20 + (((tickAnim - 24) / 10) * (25.28-(20)));
            yy = 0 + (((tickAnim - 24) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 10) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 41) {
            xx = 25.28 + (((tickAnim - 34) / 7) * (6.85-(25.28)));
            yy = 0 + (((tickAnim - 34) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 7) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 47) {
            xx = 6.85 + (((tickAnim - 41) / 6) * (15-(6.85)));
            yy = 0 + (((tickAnim - 41) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 6) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 15 + (((tickAnim - 47) / 13) * (0-(15)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (15-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 15 + (((tickAnim - 23) / 7) * (0-(15)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (15-(0)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 15 + (((tickAnim - 43) / 5) * (0-(15)));
            yy = 0 + (((tickAnim - 43) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraInostrancevia entity = (EntityPrehistoricFloraInostrancevia) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = -7.5 + (((tickAnim - 10) / 20) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -7.5 + (((tickAnim - 30) / 10) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -7.5 + (((tickAnim - 10) / 10) * (-10-(-7.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -10 + (((tickAnim - 20) / 10) * (-7.5-(-10)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -7.5 + (((tickAnim - 30) / 10) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -12.5 + (((tickAnim - 13) / 7) * (-22.5-(-12.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = -22.5 + (((tickAnim - 20) / 7) * (-12.5-(-22.5)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = -12.5 + (((tickAnim - 27) / 13) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 9 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 9) / 8) * (50-(0)));
            yy = 0 + (((tickAnim - 9) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 8) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 50 + (((tickAnim - 17) / 5) * (50-(50)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 50 + (((tickAnim - 22) / 5) * (0-(50)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraInostrancevia entity = (EntityPrehistoricFloraInostrancevia) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 15 + (((tickAnim - 5) / 5) * (22.5-(15)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 22.5 + (((tickAnim - 10) / 5) * (1.25-(22.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 1.25 + (((tickAnim - 15) / 5) * (0-(1.25)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 2.5 + (((tickAnim - 5) / 5) * (6.67-(2.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 6.67 + (((tickAnim - 10) / 5) * (-6.66-(6.67)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -6.66 + (((tickAnim - 15) / 5) * (0-(-6.66)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 2.5 + (((tickAnim - 5) / 5) * (4.17-(2.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 4.17 + (((tickAnim - 10) / 5) * (-15.41-(4.17)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -15.41 + (((tickAnim - 15) / 5) * (0-(-15.41)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (32.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 32.5 + (((tickAnim - 5) / 5) * (32.5-(32.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 32.5 + (((tickAnim - 10) / 5) * (0-(32.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animRelax(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraInostrancevia entity = (EntityPrehistoricFloraInostrancevia) entitylivingbaseIn;

        int animCycle = 400;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -7.5 + (((tickAnim - 10) / 10) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 380) {
            xx = 0 + (((tickAnim - 20) / 360) * (2.5-(0)));
            yy = 0 + (((tickAnim - 20) / 360) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 360) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 390) {
            xx = 2.5 + (((tickAnim - 380) / 10) * (5-(2.5)));
            yy = 0 + (((tickAnim - 380) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 380) / 10) * (0-(0)));
        }
        else if (tickAnim >= 390 && tickAnim < 400) {
            xx = 5 + (((tickAnim - 390) / 10) * (0-(5)));
            yy = 0 + (((tickAnim - 390) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 390) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-9-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 380) {
            xx = 0 + (((tickAnim - 20) / 360) * (0-(0)));
            yy = -9 + (((tickAnim - 20) / 360) * (-9-(-9)));
            zz = 0 + (((tickAnim - 20) / 360) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 380) / 20) * (0-(0)));
            yy = -9 + (((tickAnim - 380) / 20) * (0-(-9)));
            zz = 0 + (((tickAnim - 380) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (20.46802-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.18984-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (4.37417-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 20.46802 + (((tickAnim - 10) / 5) * (20.47544-(20.46802)));
            yy = -0.18984 + (((tickAnim - 10) / 5) * (0-(-0.18984)));
            zz = 4.37417 + (((tickAnim - 10) / 5) * (4.40924-(4.37417)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 20.47544 + (((tickAnim - 15) / 15) * (60.91305-(20.47544)));
            yy = 0 + (((tickAnim - 15) / 15) * (-4.30991-(0)));
            zz = 4.40924 + (((tickAnim - 15) / 15) * (11.84308-(4.40924)));
        }
        else if (tickAnim >= 30 && tickAnim < 380) {
            xx = 60.91305 + (((tickAnim - 30) / 350) * (20.47544-(60.91305)));
            yy = -4.30991 + (((tickAnim - 30) / 350) * (0-(-4.30991)));
            zz = 11.84308 + (((tickAnim - 30) / 350) * (4.40924-(11.84308)));
        }
        else if (tickAnim >= 380 && tickAnim < 400) {
            xx = 20.47544 + (((tickAnim - 380) / 20) * (0-(20.47544)));
            yy = 0 + (((tickAnim - 380) / 20) * (0-(0)));
            zz = 4.40924 + (((tickAnim - 380) / 20) * (0-(4.40924)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = -0.5 + (((tickAnim - 10) / 5) * (3-(-0.5)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 3 + (((tickAnim - 15) / 8) * (3-(3)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 3 + (((tickAnim - 23) / 7) * (1-(3)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 380) {
            xx = 0 + (((tickAnim - 30) / 350) * (0-(0)));
            yy = 1 + (((tickAnim - 30) / 350) * (3-(1)));
            zz = 0 + (((tickAnim - 30) / 350) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 380) / 20) * (0-(0)));
            yy = 3 + (((tickAnim - 380) / 20) * (0-(3)));
            zz = 0 + (((tickAnim - 380) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm.rotationPointX = this.leftarm.rotationPointX + (float)(xx);
        this.leftarm.rotationPointY = this.leftarm.rotationPointY - (float)(yy);
        this.leftarm.rotationPointZ = this.leftarm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -8.75 + (((tickAnim - 10) / 5) * (-47.5-(-8.75)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -47.5 + (((tickAnim - 15) / 5) * (-75.55-(-47.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -75.55 + (((tickAnim - 20) / 10) * (-109.14-(-75.55)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 358) {
            xx = -109.14 + (((tickAnim - 30) / 328) * (-98.38-(-109.14)));
            yy = 0 + (((tickAnim - 30) / 328) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 328) * (0-(0)));
        }
        else if (tickAnim >= 358 && tickAnim < 380) {
            xx = -98.38 + (((tickAnim - 358) / 22) * (-97.5-(-98.38)));
            yy = 0 + (((tickAnim - 358) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 358) / 22) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 391) {
            xx = -97.5 + (((tickAnim - 380) / 11) * (-75.1-(-97.5)));
            yy = 0 + (((tickAnim - 380) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 380) / 11) * (0-(0)));
        }
        else if (tickAnim >= 391 && tickAnim < 395) {
            xx = -75.1 + (((tickAnim - 391) / 4) * (-61.19-(-75.1)));
            yy = 0 + (((tickAnim - 391) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 391) / 4) * (0-(0)));
        }
        else if (tickAnim >= 395 && tickAnim < 400) {
            xx = -61.19 + (((tickAnim - 395) / 5) * (0-(-61.19)));
            yy = 0 + (((tickAnim - 395) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 395) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 0) / 400) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 400) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 400) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm2.rotationPointX = this.leftarm2.rotationPointX + (float)(xx);
        this.leftarm2.rotationPointY = this.leftarm2.rotationPointY - (float)(yy);
        this.leftarm2.rotationPointZ = this.leftarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -5 + (((tickAnim - 10) / 5) * (37.5-(-5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 37.5 + (((tickAnim - 15) / 5) * (49.65-(37.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 49.65 + (((tickAnim - 20) / 10) * (51.44-(49.65)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 380) {
            xx = 51.44 + (((tickAnim - 30) / 350) * (70-(51.44)));
            yy = 0 + (((tickAnim - 30) / 350) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 350) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 391) {
            xx = 70 + (((tickAnim - 380) / 11) * (67.5-(70)));
            yy = 0 + (((tickAnim - 380) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 380) / 11) * (0-(0)));
        }
        else if (tickAnim >= 391 && tickAnim < 395) {
            xx = 67.5 + (((tickAnim - 391) / 4) * (48.41-(67.5)));
            yy = 0 + (((tickAnim - 391) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 391) / 4) * (0-(0)));
        }
        else if (tickAnim >= 395 && tickAnim < 400) {
            xx = 48.41 + (((tickAnim - 395) / 5) * (0-(48.41)));
            yy = 0 + (((tickAnim - 395) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 395) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 0) / 400) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 400) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 400) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefthand.rotationPointX = this.lefthand.rotationPointX + (float)(xx);
        this.lefthand.rotationPointY = this.lefthand.rotationPointY - (float)(yy);
        this.lefthand.rotationPointZ = this.lefthand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-4.00209-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.18849-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.35208-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -4.00209 + (((tickAnim - 15) / 8) * (-53.64198-(-4.00209)));
            yy = -0.18849 + (((tickAnim - 15) / 8) * (5.86799-(-0.18849)));
            zz = -0.35208 + (((tickAnim - 15) / 8) * (7.35608-(-0.35208)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = -53.64198 + (((tickAnim - 23) / 6) * (-63.93526-(-53.64198)));
            yy = 5.86799 + (((tickAnim - 23) / 6) * (4.18399-(5.86799)));
            zz = 7.35608 + (((tickAnim - 23) / 6) * (10.52549-(7.35608)));
        }
        else if (tickAnim >= 29 && tickAnim < 351) {
            xx = -63.93526 + (((tickAnim - 29) / 322) * (-73.76433-(-63.93526)));
            yy = 4.18399 + (((tickAnim - 29) / 322) * (6.38605-(4.18399)));
            zz = 10.52549 + (((tickAnim - 29) / 322) * (11.72834-(10.52549)));
        }
        else if (tickAnim >= 351 && tickAnim < 370) {
            xx = -73.76433 + (((tickAnim - 351) / 19) * (-73.75409-(-73.76433)));
            yy = 6.38605 + (((tickAnim - 351) / 19) * (6.42878-(6.38605)));
            zz = 11.72834 + (((tickAnim - 351) / 19) * (11.72465-(11.72834)));
        }
        else if (tickAnim >= 370 && tickAnim < 380) {
            xx = -73.75409 + (((tickAnim - 370) / 10) * (-64.93841-(-73.75409)));
            yy = 6.42878 + (((tickAnim - 370) / 10) * (6.91341-(6.42878)));
            zz = 11.72465 + (((tickAnim - 370) / 10) * (9.95028-(11.72465)));
        }
        else if (tickAnim >= 380 && tickAnim < 400) {
            xx = -64.93841 + (((tickAnim - 380) / 20) * (0-(-64.93841)));
            yy = 6.91341 + (((tickAnim - 380) / 20) * (0-(6.91341)));
            zz = 9.95028 + (((tickAnim - 380) / 20) * (0-(9.95028)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 370) {
            xx = 0 + (((tickAnim - 29) / 341) * (0-(0)));
            yy = 1 + (((tickAnim - 29) / 341) * (2-(1)));
            zz = 0 + (((tickAnim - 29) / 341) * (0-(0)));
        }
        else if (tickAnim >= 370 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 370) / 30) * (0-(0)));
            yy = 2 + (((tickAnim - 370) / 30) * (0-(2)));
            zz = 0 + (((tickAnim - 370) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm.rotationPointX = this.rightarm.rotationPointX + (float)(xx);
        this.rightarm.rotationPointY = this.rightarm.rotationPointY - (float)(yy);
        this.rightarm.rotationPointZ = this.rightarm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-60.87-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -60.87 + (((tickAnim - 15) / 8) * (-41.68-(-60.87)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = -41.68 + (((tickAnim - 23) / 6) * (-7.5-(-41.68)));
            yy = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 6) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 370) {
            xx = -7.5 + (((tickAnim - 29) / 341) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 29) / 341) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 341) * (0-(0)));
        }
        else if (tickAnim >= 370 && tickAnim < 391) {
            xx = -7.5 + (((tickAnim - 370) / 21) * (-75.94-(-7.5)));
            yy = 0 + (((tickAnim - 370) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 370) / 21) * (0-(0)));
        }
        else if (tickAnim >= 391 && tickAnim < 394) {
            xx = -75.94 + (((tickAnim - 391) / 3) * (-35.83-(-75.94)));
            yy = 0 + (((tickAnim - 391) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 391) / 3) * (0-(0)));
        }
        else if (tickAnim >= 394 && tickAnim < 400) {
            xx = -35.83 + (((tickAnim - 394) / 6) * (0-(-35.83)));
            yy = 0 + (((tickAnim - 394) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 394) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (72.11-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 72.11 + (((tickAnim - 15) / 8) * (74.81-(72.11)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 74.81 + (((tickAnim - 23) / 6) * (77.5-(74.81)));
            yy = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 6) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 351) {
            xx = 77.5 + (((tickAnim - 29) / 322) * (75.7-(77.5)));
            yy = 0 + (((tickAnim - 29) / 322) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 322) * (0-(0)));
        }
        else if (tickAnim >= 351 && tickAnim < 370) {
            xx = 75.7 + (((tickAnim - 351) / 19) * (75-(75.7)));
            yy = 0 + (((tickAnim - 351) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 351) / 19) * (0-(0)));
        }
        else if (tickAnim >= 370 && tickAnim < 380) {
            xx = 75 + (((tickAnim - 370) / 10) * (83.48-(75)));
            yy = 0 + (((tickAnim - 370) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 370) / 10) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 391) {
            xx = 83.48 + (((tickAnim - 380) / 11) * (110.96-(83.48)));
            yy = 0 + (((tickAnim - 380) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 380) / 11) * (0-(0)));
        }
        else if (tickAnim >= 391 && tickAnim < 395) {
            xx = 110.96 + (((tickAnim - 391) / 4) * (40.52-(110.96)));
            yy = 0 + (((tickAnim - 391) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 391) / 4) * (0-(0)));
        }
        else if (tickAnim >= 395 && tickAnim < 400) {
            xx = 40.52 + (((tickAnim - 395) / 5) * (0-(40.52)));
            yy = 0 + (((tickAnim - 395) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 395) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 39) * (-12.5-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 39) / 20) * (7.5-(0)));
            yy = -12.5 + (((tickAnim - 39) / 20) * (-12.5-(-12.5)));
            zz = 0 + (((tickAnim - 39) / 20) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 79) {
            xx = 7.5 + (((tickAnim - 59) / 20) * (7.5-(7.5)));
            yy = -12.5 + (((tickAnim - 59) / 20) * (-12.5-(-12.5)));
            zz = 0 + (((tickAnim - 59) / 20) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 100) {
            xx = 7.5 + (((tickAnim - 79) / 21) * (9.15179-(7.5)));
            yy = -12.5 + (((tickAnim - 79) / 21) * (-7.8125-(-12.5)));
            zz = 0 + (((tickAnim - 79) / 21) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 126) {
            xx = 9.15179 + (((tickAnim - 100) / 26) * (0-(9.15179)));
            yy = -7.8125 + (((tickAnim - 100) / 26) * (-2-(-7.8125)));
            zz = 0 + (((tickAnim - 100) / 26) * (0-(0)));
        }
        else if (tickAnim >= 126 && tickAnim < 273) {
            xx = 0 + (((tickAnim - 126) / 147) * (7.87582-(0)));
            yy = -2 + (((tickAnim - 126) / 147) * (-0.93009-(-2)));
            zz = 0 + (((tickAnim - 126) / 147) * (0-(0)));
        }
        else if (tickAnim >= 273 && tickAnim < 317) {
            xx = 7.87582 + (((tickAnim - 273) / 44) * (7.34602-(7.87582)));
            yy = -0.93009 + (((tickAnim - 273) / 44) * (12.81154-(-0.93009)));
            zz = 0 + (((tickAnim - 273) / 44) * (0.88492-(0)));
        }
        else if (tickAnim >= 317 && tickAnim < 351) {
            xx = 7.34602 + (((tickAnim - 317) / 34) * (11.09684-(7.34602)));
            yy = 12.81154 + (((tickAnim - 317) / 34) * (5.91536-(12.81154)));
            zz = 0.88492 + (((tickAnim - 317) / 34) * (0.41373-(0.88492)));
        }
        else if (tickAnim >= 351 && tickAnim < 381) {
            xx = 11.09684 + (((tickAnim - 351) / 30) * (5-(11.09684)));
            yy = 5.91536 + (((tickAnim - 351) / 30) * (-0.13982-(5.91536)));
            zz = 0.41373 + (((tickAnim - 351) / 30) * (0-(0.41373)));
        }
        else if (tickAnim >= 381 && tickAnim < 400) {
            xx = 5 + (((tickAnim - 381) / 19) * (0-(5)));
            yy = -0.13982 + (((tickAnim - 381) / 19) * (0-(-0.13982)));
            zz = 0 + (((tickAnim - 381) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (0.81097-(0)));
            yy = 0 + (((tickAnim - 0) / 39) * (-8.88258-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (-4.94059-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 63) {
            xx = 0.81097 + (((tickAnim - 39) / 24) * (-0.12145-(0.81097)));
            yy = -8.88258 + (((tickAnim - 39) / 24) * (-8.11422-(-8.88258)));
            zz = -4.94059 + (((tickAnim - 39) / 24) * (-3.02053-(-4.94059)));
        }
        else if (tickAnim >= 63 && tickAnim < 81) {
            xx = -0.12145 + (((tickAnim - 63) / 18) * (-2.22812-(-0.12145)));
            yy = -8.11422 + (((tickAnim - 63) / 18) * (-3.38386-(-8.11422)));
            zz = -3.02053 + (((tickAnim - 63) / 18) * (1.80421-(-3.02053)));
        }
        else if (tickAnim >= 81 && tickAnim < 97) {
            xx = -2.22812 + (((tickAnim - 81) / 16) * (6.58167-(-2.22812)));
            yy = -3.38386 + (((tickAnim - 81) / 16) * (0.21752-(-3.38386)));
            zz = 1.80421 + (((tickAnim - 81) / 16) * (-0.20446-(1.80421)));
        }
        else if (tickAnim >= 97 && tickAnim < 115) {
            xx = 6.58167 + (((tickAnim - 97) / 18) * (-4.26139-(6.58167)));
            yy = 0.21752 + (((tickAnim - 97) / 18) * (2.7685-(0.21752)));
            zz = -0.20446 + (((tickAnim - 97) / 18) * (-1.62726-(-0.20446)));
        }
        else if (tickAnim >= 115 && tickAnim < 140) {
            xx = -4.26139 + (((tickAnim - 115) / 25) * (0.85399-(-4.26139)));
            yy = 2.7685 + (((tickAnim - 115) / 25) * (13.08001-(2.7685)));
            zz = -1.62726 + (((tickAnim - 115) / 25) * (0.99933-(-1.62726)));
        }
        else if (tickAnim >= 140 && tickAnim < 161) {
            xx = 0.85399 + (((tickAnim - 140) / 21) * (8.28556-(0.85399)));
            yy = 13.08001 + (((tickAnim - 140) / 21) * (12.03193-(13.08001)));
            zz = 0.99933 + (((tickAnim - 140) / 21) * (0.91926-(0.99933)));
        }
        else if (tickAnim >= 161 && tickAnim < 203) {
            xx = 8.28556 + (((tickAnim - 161) / 42) * (-3.18679-(8.28556)));
            yy = 12.03193 + (((tickAnim - 161) / 42) * (9.89385-(12.03193)));
            zz = 0.91926 + (((tickAnim - 161) / 42) * (0.7559-(0.91926)));
        }
        else if (tickAnim >= 203 && tickAnim < 251) {
            xx = -3.18679 + (((tickAnim - 203) / 48) * (-2.49409-(-3.18679)));
            yy = 9.89385 + (((tickAnim - 203) / 48) * (2.58077-(9.89385)));
            zz = 0.7559 + (((tickAnim - 203) / 48) * (-0.30184-(0.7559)));
        }
        else if (tickAnim >= 251 && tickAnim < 294) {
            xx = -2.49409 + (((tickAnim - 251) / 43) * (5.73045-(-2.49409)));
            yy = 2.58077 + (((tickAnim - 251) / 43) * (1.83105-(2.58077)));
            zz = -0.30184 + (((tickAnim - 251) / 43) * (-0.21416-(-0.30184)));
        }
        else if (tickAnim >= 294 && tickAnim < 318) {
            xx = 5.73045 + (((tickAnim - 294) / 24) * (-8.21444-(5.73045)));
            yy = 1.83105 + (((tickAnim - 294) / 24) * (1.41294-(1.83105)));
            zz = -0.21416 + (((tickAnim - 294) / 24) * (-0.16525-(-0.21416)));
        }
        else if (tickAnim >= 318 && tickAnim < 340) {
            xx = -8.21444 + (((tickAnim - 318) / 22) * (-1.75124-(-8.21444)));
            yy = 1.41294 + (((tickAnim - 318) / 22) * (1.03808-(1.41294)));
            zz = -0.16525 + (((tickAnim - 318) / 22) * (-0.12141-(-0.16525)));
        }
        else if (tickAnim >= 340 && tickAnim < 361) {
            xx = -1.75124 + (((tickAnim - 340) / 21) * (-11.14317-(-1.75124)));
            yy = 1.03808 + (((tickAnim - 340) / 21) * (0.67763-(1.03808)));
            zz = -0.12141 + (((tickAnim - 340) / 21) * (-0.07925-(-0.12141)));
        }
        else if (tickAnim >= 361 && tickAnim < 381) {
            xx = -11.14317 + (((tickAnim - 361) / 20) * (8.16398-(-11.14317)));
            yy = 0.67763 + (((tickAnim - 361) / 20) * (0.33161-(0.67763)));
            zz = -0.07925 + (((tickAnim - 361) / 20) * (-0.03878-(-0.07925)));
        }
        else if (tickAnim >= 381 && tickAnim < 400) {
            xx = 8.16398 + (((tickAnim - 381) / 19) * (0-(8.16398)));
            yy = 0.33161 + (((tickAnim - 381) / 19) * (0-(0.33161)));
            zz = -0.03878 + (((tickAnim - 381) / 19) * (0-(-0.03878)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (-0.5332-(0)));
            yy = 0 + (((tickAnim - 0) / 39) * (-13.44609-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (2.37472-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 83) {
            xx = -0.5332 + (((tickAnim - 39) / 44) * (-0.5332-(-0.5332)));
            yy = -13.44609 + (((tickAnim - 39) / 44) * (-13.44609-(-13.44609)));
            zz = 2.37472 + (((tickAnim - 39) / 44) * (2.37472-(2.37472)));
        }
        else if (tickAnim >= 83 && tickAnim < 99) {
            xx = -0.5332 + (((tickAnim - 83) / 16) * (-17.94454-(-0.5332)));
            yy = -13.44609 + (((tickAnim - 83) / 16) * (-11.21025-(-13.44609)));
            zz = 2.37472 + (((tickAnim - 83) / 16) * (1.97985-(2.37472)));
        }
        else if (tickAnim >= 99 && tickAnim < 115) {
            xx = -17.94454 + (((tickAnim - 99) / 16) * (-16.3305-(-17.94454)));
            yy = -11.21025 + (((tickAnim - 99) / 16) * (-16.18194-(-11.21025)));
            zz = 1.97985 + (((tickAnim - 99) / 16) * (1.43273-(1.97985)));
        }
        else if (tickAnim >= 115 && tickAnim < 126) {
            xx = -16.3305 + (((tickAnim - 115) / 11) * (-15.44454-(-16.3305)));
            yy = -16.18194 + (((tickAnim - 115) / 11) * (-11.21025-(-16.18194)));
            zz = 1.43273 + (((tickAnim - 115) / 11) * (1.97985-(1.43273)));
        }
        else if (tickAnim >= 126 && tickAnim < 140) {
            xx = -15.44454 + (((tickAnim - 126) / 14) * (-11.62509-(-15.44454)));
            yy = -11.21025 + (((tickAnim - 126) / 14) * (-11.21025-(-11.21025)));
            zz = 1.97985 + (((tickAnim - 126) / 14) * (1.97985-(1.97985)));
        }
        else if (tickAnim >= 140 && tickAnim < 156) {
            xx = -11.62509 + (((tickAnim - 140) / 16) * (-17.94454-(-11.62509)));
            yy = -11.21025 + (((tickAnim - 140) / 16) * (-11.21025-(-11.21025)));
            zz = 1.97985 + (((tickAnim - 140) / 16) * (1.97985-(1.97985)));
        }
        else if (tickAnim >= 156 && tickAnim < 173) {
            xx = -17.94454 + (((tickAnim - 156) / 17) * (-16.73668-(-17.94454)));
            yy = -11.21025 + (((tickAnim - 156) / 17) * (0.04403-(-11.21025)));
            zz = 1.97985 + (((tickAnim - 156) / 17) * (-2.12416-(1.97985)));
        }
        else if (tickAnim >= 173 && tickAnim < 203) {
            xx = -16.73668 + (((tickAnim - 173) / 30) * (0.47847-(-16.73668)));
            yy = 0.04403 + (((tickAnim - 173) / 30) * (0.0382-(0.04403)));
            zz = -2.12416 + (((tickAnim - 173) / 30) * (-1.84302-(-2.12416)));
        }
        else if (tickAnim >= 203 && tickAnim < 256) {
            xx = 0.47847 + (((tickAnim - 203) / 53) * (0.47847-(0.47847)));
            yy = 0.0382 + (((tickAnim - 203) / 53) * (0.0382-(0.0382)));
            zz = -1.84302 + (((tickAnim - 203) / 53) * (-1.84302-(-1.84302)));
        }
        else if (tickAnim >= 256 && tickAnim < 263) {
            xx = 0.47847 + (((tickAnim - 256) / 7) * (2.61668-(0.47847)));
            yy = 0.0382 + (((tickAnim - 256) / 7) * (3.22519-(0.0382)));
            zz = -1.84302 + (((tickAnim - 256) / 7) * (-8.06807-(-1.84302)));
        }
        else if (tickAnim >= 263 && tickAnim < 292) {
            xx = 2.61668 + (((tickAnim - 263) / 29) * (2.61668-(2.61668)));
            yy = 3.22519 + (((tickAnim - 263) / 29) * (3.22519-(3.22519)));
            zz = -8.06807 + (((tickAnim - 263) / 29) * (-8.06807-(-8.06807)));
        }
        else if (tickAnim >= 292 && tickAnim < 298) {
            xx = 2.61668 + (((tickAnim - 292) / 6) * (0.47847-(2.61668)));
            yy = 3.22519 + (((tickAnim - 292) / 6) * (0.0382-(3.22519)));
            zz = -8.06807 + (((tickAnim - 292) / 6) * (-1.84302-(-8.06807)));
        }
        else if (tickAnim >= 298 && tickAnim < 351) {
            xx = 0.47847 + (((tickAnim - 298) / 53) * (-12.746-(0.47847)));
            yy = 0.0382 + (((tickAnim - 298) / 53) * (0.01683-(0.0382)));
            zz = -1.84302 + (((tickAnim - 298) / 53) * (-0.81173-(-1.84302)));
        }
        else if (tickAnim >= 351 && tickAnim < 368) {
            xx = -12.746 + (((tickAnim - 351) / 17) * (-37.3574-(-12.746)));
            yy = 0.01683 + (((tickAnim - 351) / 17) * (0.0097-(0.01683)));
            zz = -0.81173 + (((tickAnim - 351) / 17) * (-0.46796-(-0.81173)));
        }
        else if (tickAnim >= 368 && tickAnim < 385) {
            xx = -37.3574 + (((tickAnim - 368) / 17) * (7.53649-(-37.3574)));
            yy = 0.0097 + (((tickAnim - 368) / 17) * (0.00291-(0.0097)));
            zz = -0.46796 + (((tickAnim - 368) / 17) * (-0.14057-(-0.46796)));
        }
        else if (tickAnim >= 385 && tickAnim < 400) {
            xx = 7.53649 + (((tickAnim - 385) / 15) * (0-(7.53649)));
            yy = 0.00291 + (((tickAnim - 385) / 15) * (0-(0.00291)));
            zz = -0.14057 + (((tickAnim - 385) / 15) * (0-(-0.14057)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 355 && tickAnim < 368) {
            xx = 0 + (((tickAnim - 355) / 13) * (45-(0)));
            yy = 0 + (((tickAnim - 355) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 355) / 13) * (0-(0)));
        }
        else if (tickAnim >= 368 && tickAnim < 380) {
            xx = 45 + (((tickAnim - 368) / 12) * (0-(45)));
            yy = 0 + (((tickAnim - 368) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 368) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 380) {
            xx = 7.5 + (((tickAnim - 20) / 360) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 20) / 360) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 360) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 400) {
            xx = 7.5 + (((tickAnim - 380) / 20) * (0-(7.5)));
            yy = 0 + (((tickAnim - 380) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 380) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -18.75 + (((tickAnim - 10) / 10) * (-52.5-(-18.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 380) {
            xx = -52.5 + (((tickAnim - 20) / 360) * (-52.5-(-52.5)));
            yy = 0 + (((tickAnim - 20) / 360) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 360) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 400) {
            xx = -52.5 + (((tickAnim - 380) / 20) * (0-(-52.5)));
            yy = 0 + (((tickAnim - 380) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 380) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 380) {
            xx = 0 + (((tickAnim - 20) / 360) * (0-(0)));
            yy = 1 + (((tickAnim - 20) / 360) * (1-(1)));
            zz = 0 + (((tickAnim - 20) / 360) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 380) / 20) * (0-(0)));
            yy = 1 + (((tickAnim - 380) / 20) * (0-(1)));
            zz = 0 + (((tickAnim - 380) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg.rotationPointX = this.leftleg.rotationPointX + (float)(xx);
        this.leftleg.rotationPointY = this.leftleg.rotationPointY - (float)(yy);
        this.leftleg.rotationPointZ = this.leftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (52.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 380) {
            xx = 52.5 + (((tickAnim - 20) / 360) * (52.5-(52.5)));
            yy = 0 + (((tickAnim - 20) / 360) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 360) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 400) {
            xx = 52.5 + (((tickAnim - 380) / 20) * (0-(52.5)));
            yy = 0 + (((tickAnim - 380) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 380) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-2.47864-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.32621-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (7.49294-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 380) {
            xx = -2.47864 + (((tickAnim - 20) / 360) * (-2.5-(-2.47864)));
            yy = 0.32621 + (((tickAnim - 20) / 360) * (0-(0.32621)));
            zz = 7.49294 + (((tickAnim - 20) / 360) * (0-(7.49294)));
        }
        else if (tickAnim >= 380 && tickAnim < 400) {
            xx = -2.5 + (((tickAnim - 380) / 20) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 380) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 380) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -22.5 + (((tickAnim - 10) / 10) * (-60-(-22.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 380) {
            xx = -60 + (((tickAnim - 20) / 360) * (-60-(-60)));
            yy = 0 + (((tickAnim - 20) / 360) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 360) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 400) {
            xx = -60 + (((tickAnim - 380) / 20) * (0-(-60)));
            yy = 0 + (((tickAnim - 380) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 380) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (60-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 380) {
            xx = 60 + (((tickAnim - 20) / 360) * (60-(60)));
            yy = 0 + (((tickAnim - 20) / 360) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 360) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 400) {
            xx = 60 + (((tickAnim - 380) / 20) * (0-(60)));
            yy = 0 + (((tickAnim - 380) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 380) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-10-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 20) / 380) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 380) * (0-(0)));
            zz = -10 + (((tickAnim - 20) / 380) * (0-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 370) {
            xx = -7.5 + (((tickAnim - 20) / 350) * (-0.59-(-7.5)));
            yy = 0 + (((tickAnim - 20) / 350) * (0-(0)));
            zz = -5 + (((tickAnim - 20) / 350) * (-0.39-(-5)));
        }
        else if (tickAnim >= 370 && tickAnim < 388) {
            xx = -0.59 + (((tickAnim - 370) / 18) * (-0.22857-(-0.59)));
            yy = 0 + (((tickAnim - 370) / 18) * (-0.02-(0)));
            zz = -0.39 + (((tickAnim - 370) / 18) * (-5.15163-(-0.39)));
        }
        else if (tickAnim >= 388 && tickAnim < 394) {
            xx = -0.22857 + (((tickAnim - 388) / 6) * (-0.11472-(-0.22857)));
            yy = -0.02 + (((tickAnim - 388) / 6) * (0-(-0.02)));
            zz = -5.15163 + (((tickAnim - 388) / 6) * (2.42418-(-5.15163)));
        }
        else if (tickAnim >= 394 && tickAnim < 400) {
            xx = -0.11472 + (((tickAnim - 394) / 6) * (0-(-0.11472)));
            yy = 0 + (((tickAnim - 394) / 6) * (0-(0)));
            zz = 2.42418 + (((tickAnim - 394) / 6) * (0-(2.42418)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animSniff(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraInostrancevia entity = (EntityPrehistoricFloraInostrancevia) entitylivingbaseIn;

        int animCycle = 60;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (10.31-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 10.31 + (((tickAnim - 4) / 9) * (25-(10.31)));
            yy = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 9) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 24) {
            xx = 25 + (((tickAnim - 13) / 11) * (27.5-(25)));
            yy = 0 + (((tickAnim - 13) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 11) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 36) {
            xx = 27.5 + (((tickAnim - 24) / 12) * (18.05926-(27.5)));
            yy = 0 + (((tickAnim - 24) / 12) * (14.95699-(0)));
            zz = 0 + (((tickAnim - 24) / 12) * (-1.14827-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 18.05926 + (((tickAnim - 36) / 7) * (22.05926-(18.05926)));
            yy = 14.95699 + (((tickAnim - 36) / 7) * (14.95699-(14.95699)));
            zz = -1.14827 + (((tickAnim - 36) / 7) * (-1.14827-(-1.14827)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 22.05926 + (((tickAnim - 43) / 5) * (20.55926-(22.05926)));
            yy = 14.95699 + (((tickAnim - 43) / 5) * (14.95699-(14.95699)));
            zz = -1.14827 + (((tickAnim - 43) / 5) * (-1.14827-(-1.14827)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = 20.55926 + (((tickAnim - 48) / 12) * (0-(20.55926)));
            yy = 14.95699 + (((tickAnim - 48) / 12) * (0-(14.95699)));
            zz = -1.14827 + (((tickAnim - 48) / 12) * (0-(-1.14827)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 7.5 + (((tickAnim - 17) / 6) * (0-(7.5)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (7.5-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 7.5 + (((tickAnim - 28) / 6) * (-2.02-(7.5)));
            yy = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 6) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = -2.02 + (((tickAnim - 34) / 9) * (6.2-(-2.02)));
            yy = 0 + (((tickAnim - 34) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 9) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 6.2 + (((tickAnim - 43) / 17) * (0-(6.2)));
            yy = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 5 + (((tickAnim - 20) / 4) * (-3.02-(5)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -3.02 + (((tickAnim - 24) / 4) * (5-(-3.02)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 42) {
            xx = 5 + (((tickAnim - 28) / 14) * (5-(5)));
            yy = 0 + (((tickAnim - 28) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 14) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = 5 + (((tickAnim - 42) / 4) * (-10.52-(5)));
            yy = 0 + (((tickAnim - 42) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 4) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -10.52 + (((tickAnim - 46) / 4) * (5-(-10.52)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 5 + (((tickAnim - 50) / 10) * (0-(5)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animYawn(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraInostrancevia entity = (EntityPrehistoricFloraInostrancevia) entitylivingbaseIn;

        int animCycle = 70;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = 12.5 + (((tickAnim - 20) / 11) * (6.46-(12.5)));
            yy = 0 + (((tickAnim - 20) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 11) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 36) {
            xx = 6.46 + (((tickAnim - 31) / 5) * (5-(6.46)));
            yy = 0 + (((tickAnim - 31) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 5) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 5 + (((tickAnim - 36) / 7) * (5-(5)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = 5 + (((tickAnim - 43) / 10) * (19.9-(5)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 19.9 + (((tickAnim - 53) / 7) * (0-(19.9)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -12.5 + (((tickAnim - 15) / 10) * (-12.5-(-12.5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = -12.5 + (((tickAnim - 25) / 9) * (-22-(-12.5)));
            yy = 0 + (((tickAnim - 25) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 9) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = -22 + (((tickAnim - 34) / 4) * (-22.6-(-22)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 55) {
            xx = -22.6 + (((tickAnim - 38) / 17) * (-10-(-22.6)));
            yy = 0 + (((tickAnim - 38) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 17) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -10 + (((tickAnim - 55) / 5) * (0-(-10)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 34) {
            xx = -25 + (((tickAnim - 20) / 14) * (-25-(-25)));
            yy = 0 + (((tickAnim - 20) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 14) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = -25 + (((tickAnim - 34) / 3) * (-25-(-25)));
            yy = 0 + (((tickAnim - 34) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 3) * (8-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = -25 + (((tickAnim - 37) / 1) * (-25-(-25)));
            yy = 0 + (((tickAnim - 37) / 1) * (0-(0)));
            zz = 8 + (((tickAnim - 37) / 1) * (0-(8)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -25 + (((tickAnim - 38) / 2) * (-25-(-25)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (-8-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = -25 + (((tickAnim - 40) / 2) * (-25-(-25)));
            yy = 0 + (((tickAnim - 40) / 2) * (0-(0)));
            zz = -8 + (((tickAnim - 40) / 2) * (0-(-8)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = -25 + (((tickAnim - 42) / 3) * (-25-(-25)));
            yy = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 3) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = -25 + (((tickAnim - 45) / 15) * (0-(-25)));
            yy = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 15) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 60) / 4) * (-5-(0)));
            yy = 0 + (((tickAnim - 60) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 4) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 70) {
            xx = -5 + (((tickAnim - 64) / 6) * (0-(-5)));
            yy = 0 + (((tickAnim - 64) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = 27.5 + (((tickAnim - 7) / 11) * (27.5-(27.5)));
            yy = 0 + (((tickAnim - 7) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 11) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 27.5 + (((tickAnim - 18) / 6) * (60-(27.5)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 51) {
            xx = 60 + (((tickAnim - 24) / 27) * (60-(60)));
            yy = 0 + (((tickAnim - 24) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 27) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 60) {
            xx = 60 + (((tickAnim - 51) / 9) * (0-(60)));
            yy = 0 + (((tickAnim - 51) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 9) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 60) / 3) * (8-(0)));
            yy = 0 + (((tickAnim - 60) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 3) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 65) {
            xx = 8 + (((tickAnim - 63) / 2) * (0-(8)));
            yy = 0 + (((tickAnim - 63) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 2) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 65) / 3) * (4-(0)));
            yy = 0 + (((tickAnim - 65) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 3) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 70) {
            xx = 4 + (((tickAnim - 68) / 2) * (0-(4)));
            yy = 0 + (((tickAnim - 68) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraInostrancevia e = (EntityPrehistoricFloraInostrancevia) entity;
        animator.update(entity);

    }
}
